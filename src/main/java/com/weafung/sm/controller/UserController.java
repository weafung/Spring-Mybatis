package com.weafung.sm.controller;

import com.weafung.sm.entity.User;
import com.weafung.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/select")
    public String hello() {
        User user = userService.getUser(1l);
        System.out.println(user);
        return "hello";
    }

    @RequestMapping("/insert")
    public String home() {
        User user = new User();
        user.setUsername("username");
        user.setPassword("password");
        userService.saveUser(user);
        return "hello";
    }

    @RequestMapping("/update")
    public String update() {
        User user = userService.getUser(2l);
        user.setUsername("new username");
        userService.updateUser(user);
        return "hello";
    }

    @RequestMapping("/delete")
    public String delete() {
        userService.removeUser(3l);
        return "hello";
    }
}
