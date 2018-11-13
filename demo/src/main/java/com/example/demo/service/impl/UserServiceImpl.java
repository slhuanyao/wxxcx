package com.example.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.expand.UserExpandMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
		
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserExpandMapper userExpandMapper;
	
	@Override
	public void addUser(User user) {
		userMapper.insert(user);
	}

	@Override
	public void deleteById(Integer id) {
		userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void selectAll() {
		
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public List<User> selectList(Map<String, Object> params) {
		return userExpandMapper.selectList(params);
	}

	
	
	
}
