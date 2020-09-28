package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {

    @Test
    void contextLoads() {

        List list = new ArrayList<>();
        f(list);
//        Collections.sort(list,(a,b)->Integer.compare(list.get(0),list.get(2)));

    }

    void f(List list){
    	String s="askhd";
        int i = 4;
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
    }

}
