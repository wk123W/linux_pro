package com.itgmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @PostMapping("login")
    public String login(String username,String password) {
        if (username.equals("张三") && password.equals("123456")){
                 return "index";
         }else {
            return "login";
        }
    }
}
