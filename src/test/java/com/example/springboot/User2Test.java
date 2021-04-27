package com.example.springboot;

import com.example.springboot.service.RefPoint;
import com.example.springboot.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import sun.reflect.FieldInfo;

import java.io.Console;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import static java.lang.System.in;

public class User2Test {

    UserServiceImpl userService = null;

    @Test
    public void test(){

        try {
            Class<?> aClass = Class.forName("com.example.springboot.service.UserServiceImpl");
            Method beliefs = aClass.getDeclaredMethod("beliefs", Integer.class);
            Object o = aClass.newInstance();
            beliefs.setAccessible(true);
            Object invoke = beliefs.invoke(o, 10);
            System.out.println(invoke);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void aa(){


    }




}
