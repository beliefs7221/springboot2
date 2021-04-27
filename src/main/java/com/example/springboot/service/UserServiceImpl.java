package com.example.springboot.service;


import com.example.springboot.mapper.UserMapper;
import com.example.springboot.model.User;
import com.example.springboot.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUser(){
    	int i = 0 ;
    	int j=0;
        return userMapper.getAllUser();
    }
	@Override
	public Integer getTest(Integer i) {

    	return 1;
	}

	private Integer beliefs(Integer i){
    	return 1000+i;
	}

}