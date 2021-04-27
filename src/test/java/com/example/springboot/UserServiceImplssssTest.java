package com.example.springboot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.model.User;
import com.example.springboot.service.UserServiceImpl;
import com.example.springboot.service.interfaces.UserService;

import junit.framework.Assert;

import static org.mockito.Mockito.mock;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplssssTest {

	
	@Autowired
	private UserService userServiceImpl;
	
	@Autowired
	private UserMapper userMapper;	
	
	
	@Test
	public void getTest() {
		
		Integer test = userServiceImpl.getTest(1);
		userServiceImpl.getTest(2);
		userServiceImpl.getTest(3);
		getAllUser();
		
	}
	
	@Test
	public void aaa(){
		
				try {
					Class clazz = Class.forName("com.example.springboot.service.UserServiceImpl");
					Method method = clazz.getDeclaredMethod("aaa", Integer.class);
					method.setAccessible(true);
					method.invoke(clazz.newInstance(),7);
					method.invoke(clazz.newInstance(),1);
				} catch (Exception e) {
					e.printStackTrace();
				}	           

	}
		
	
	public void getAllUser() {
		int i=1;
		List<User> allUser = userServiceImpl.getAllUser();		
	}
	
	@Test
	public void kk(){
		UserService mock = mock(UserService.class);
		mock.getAllUser();
	}
	
}
