package com.example.springboot.controller;

import com.example.springboot.model.User;
import com.example.springboot.service.interfaces.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class WebController {

    @Resource
    private UserService userService;

    @RequestMapping("/web")
    public String web(Model model){

        model.addAttribute("ak","saf");
        List<User> allUser = userService.getAllUser();
        System.out.println("*************");
        for (int i = 0; i < allUser.size(); i++) {
            System.out.println(allUser.get(i));
        }
        return "success!";
    }
}
