package com.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pojo.User;
import com.pojo.Users;

public interface UsersMapper {
	Users findbyid(Users users);

	Users selectUserLogin(Users users);

	void adduser(Users users);

	List<Map> selectAll();

	int userscount();

	List<Map> findByPage(HashMap<String, Object> pd);

	void delById(Users user);

	List<Map> finduncheck(HashMap<String, Object> pd);

	void agree(Users user);

	void updateuser(Users user);

	List<Map> findOrderByuserId(HashMap<String, Object> pd);

	void delorder(HashMap<String, Object> pd);

	List<Map> findCarByUserid(HashMap<String, Object> pd);

	List<Map> checkstats(HashMap<String, Object> pd);
	
}
