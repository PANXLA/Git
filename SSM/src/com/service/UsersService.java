package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.mapper.UsersMapper;
import com.pojo.User;
import com.pojo.Users;

@Service("usersService")
public class UsersService {
	@Resource
	private UsersMapper dao;
	/*
	* 通过id获取数据
	*/
	public Users login(Users users) throws Exception{
		// TODO Auto-generated method stub
		return (Users)dao.selectUserLogin(users);
	}
	public boolean adduser(Users users) {
		// TODO Auto-generated method stub
		 boolean flag=false;
		 try {
			dao.adduser(users);
			flag=true;
			return flag;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return flag;
		}
	}
	public Users findById(Users users) {
		// TODO Auto-generated method stub
		return dao.findbyid(users);
	}
	public List<Map> findAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
		
	}
	public int userscount() {
		// TODO Auto-generated method stub
		return dao.userscount();
	}
	public List<Map> findByPage(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		return dao.findByPage(pd);
	}
	public void delById(Users user) {
		// TODO Auto-generated method stub
		dao.delById(user);
	}
	public List<Map> finduncheck(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		return dao.finduncheck(pd);
	}
	public void agree(Users user) {
		// TODO Auto-generated method stub
		dao.agree(user);
	}
	public void updateuser(Users user) {
		// TODO Auto-generated method stub
		dao.updateuser(user);
		
	}
	public List<Map> findOrderByuserId(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		return dao.findOrderByuserId(pd);
	}
	public void delorder(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		dao.delorder(pd);
	}
	public List<Map> findCarByUserid(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		return dao.findCarByUserid(pd);
	}
	public List<Map> checkstats(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		return dao.checkstats(pd);
	}
}
