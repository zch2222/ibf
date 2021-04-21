package com.wbc.word.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.druid.stat.TableStat.Mode;
import com.wbc.word.pojo.Users;
import com.wbc.word.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	/**
	 * 页面跳转
	 */
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	/**
	 * 添加用户
	 */
	@RequestMapping("/addUser")
	public String addUser(Users u) {
		this.usersService.addUser(u);
		
		return "ok";
	}
	/**
	 * 查询全部
	 */
	@RequestMapping("/findUserAll")
	public String findUserAll(Model m) {
		List<Users> list=this.usersService.findUserAll();
		m.addAttribute("list", list);
		return "showUsers";
	}
	
	
	@RequestMapping("/findUserById")
	public String findUserById(Integer id, Model model) {
		Users u=this.usersService.selectUsersById(id);
		model.addAttribute("user", u);
		return "updateUser";
		
	}
	
	
	@RequestMapping("/delUser")
	public String delUser(Integer id) {
		
		this.usersService.deleteUserById(id);
		
		return "redirect:/users/findUserAll";
		
	}
	
	
	@RequestMapping("/editUser")
	public String editUser(Users users) {
		this.usersService.updateUser(users);
		
		return "redirect:/users/findUserAll";
	}
	
	
	
	

}
