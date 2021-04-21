package com.wbc.word.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wbc.word.mapper.GoodsMapper;
import com.wbc.word.pojo.Goods;
import com.wbc.word.service.GoodsService;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
	
	  @Autowired
	  private GoodsMapper goodsMapper;
	  

	@Override
	public List<Goods> selectGoodsAll() {
		
		return this.goodsMapper.selectGoodsAll();
	}


	@Override
	public List<Goods> selectGoodsByuser(Integer uid) {
		
		return this.goodsMapper.selectGoodsByuser(uid);
	}

}
