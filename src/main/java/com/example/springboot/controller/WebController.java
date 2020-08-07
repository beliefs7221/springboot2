package com.example.springboot.controller;

import com.example.springboot.model.User;
import com.example.springboot.service.UserServiceImpl;
import com.example.springboot.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebController {

    @Autowired
    private UserService userService;

    @RequestMapping("/web")
    public String web(){
        List<User> allUser = userService.getAllUser();
        for (int i = 0; i < allUser.size(); i++) {
            System.out.println(allUser.get(i));
        }

        return "success!";
    }
}
