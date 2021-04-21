package com.wbc.word.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wbc.word.pojo.Goods;
import com.wbc.word.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page ) {
		return page;
		
	}
	
	@RequestMapping("/findGoodAll")
	public String findGoodsAll(Model model) {
		List<Goods> list=goodsService.selectGoodsAll();
	
		model.addAttribute("list", list);
		return "showGoods";
	}
	
	@RequestMapping("/findgooduid")
	public String findgooduid(Integer uid,Model model) {
		
		List<Goods> list=goodsService.selectGoodsByuser(uid);
		model.addAttribute("list", list);
		return "showGoodsbyuid";
	}
	
	

}
