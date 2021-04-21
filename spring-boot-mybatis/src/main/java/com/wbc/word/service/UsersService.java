package com.wbc.word.service;

import java.util.List;

import com.wbc.word.pojo.Users;

public interface UsersService {
	
	void addUser(Users users);
	List<Users> findUserAll();
	void updateUser(Users u);
	void deleteUserById(Integer id);
	
	Users selectUsersById(Integer id);

}
