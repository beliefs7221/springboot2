package com.example.springboot;

import com.example.springboot.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class StreamDemo {

    @Test
    public void streamTest() {

        List<User> users = Arrays.asList(
                new User(1, "zhangsan", 23),
                new User(2, "wangwu", 21),
                new User(3, "zhaoliu", 24)
        );

        List<String> strings = Arrays.asList(
                "zhangsan",
                "wangwu",
                "zhaoliu"
        );

        List<Integer> integers = Arrays.asList(
                1,
                5,
                3
        );

        List<User> collect = users.stream().sorted((item, item2) -> item2.age - item.age).collect(Collectors.toList());
        for (int i = 0; i < collect.size(); i++) {
            System.out.println(collect.get(i));
        }

        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        List<String> collect1 = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        for (int i = 0; i < collect1.size(); i++) {
            System.out.println(collect1.get(i));
        }
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        List<Integer> collect2 = integers.stream().sorted((x, y) -> {return y-x;}).collect(Collectors.toList());
        for (int i = 0; i < collect2.size(); i++) {
            System.out.println(collect2.get(i));
        }
        System.out.println("-----------------------------------------------");
//        collect.forEach(item-> System.out.println(item));
        collect.forEach(System.out::println);



    }


}