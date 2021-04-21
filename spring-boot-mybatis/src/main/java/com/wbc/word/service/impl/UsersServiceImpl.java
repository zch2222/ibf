package com.wbc.word.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wbc.word.mapper.UsersMapper;
import com.wbc.word.pojo.Users;
import com.wbc.word.service.UsersService;

@Service
@Transactional
public class UsersServiceImpl  implements UsersService{
	
	@Autowired
	  private UsersMapper usersMapper;

	@Override
	public void addUser(Users users) {
	this.usersMapper.insertUser(users);
		
	}

	@Override
	public List<Users> findUserAll() {
	
		
		return this.usersMapper.selectUsersAll();
	}

	@Override
	public void deleteUserById(Integer id) {
		usersMapper.deleteUserById(id);
		
	}

	@Override
	public void updateUser(Users u) {
		
		usersMapper.updateUser(u);
	}

	@Override
	public Users selectUsersById(Integer id) {
		
		return usersMapper.selectUsersById(id);
	}

}
