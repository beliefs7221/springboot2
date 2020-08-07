package com.example.springboot.mapper;

import com.example.springboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> getAllUser();
}
