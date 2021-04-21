package com.wbc.word.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wbc.word.pojo.Users;

@Mapper
public interface UsersMapper {
	
   void insertUser(Users users);
	
	List<Users> selectUsersAll();
	
	void deleteUserById(Integer id) ;
	
	void updateUser(Users u);
	
	Users selectUsersById(Integer id);

}
