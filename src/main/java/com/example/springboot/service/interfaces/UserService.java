package com.example.springboot.service.interfaces;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    
    public Integer getTest(Integer i);
}
