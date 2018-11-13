package com.example.demo.mapper.expand;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.pojo.User;

@Mapper
public interface UserExpandMapper {

	List<User> selectList(Map<String, Object> params);
	
}
