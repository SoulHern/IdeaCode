package com.baizhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("/quick")
    public Object test() {
        System.out.println("测试成功");
        Map<String, String> map = new HashMap<>();
        map.put("hehe", "1234");
        return map;
    }

    @RequestMapping("/heihei")
    public Object test1() {
        System.out.println("测试成功");
        Map<String, String> map1 = new HashMap<>();
        map1.put("hehe", "1234");
        return map1;
    }

}
