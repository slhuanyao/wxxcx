package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.pojo.User;


public interface UserService {

	
	public void  addUser(User user);
	
	public void  deleteById(Integer id);
	
	public void  selectAll();
	
	public void  updateUser(User user);
	
	public List<User> selectList(Map<String,Object> params);
	
}
