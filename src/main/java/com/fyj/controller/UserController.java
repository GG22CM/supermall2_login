package com.fyj.controller;

import com.fyj.domain.User;
import com.fyj.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @CrossOrigin(origins = {"http://localhost:8081", "http://192.168.246.129:8081"})
    @PostMapping("/login")
    public User userLogin(HttpServletResponse response, String username, String password) {
        System.out.println(username);
        System.out.println(password);
        User user = userService.getUser(username, password);

        return user;
    }

    @RequestMapping("/jsonp")
    public String doJsonp(String callback) {
        return callback + "(\'你好！\')" ;
    }
}
