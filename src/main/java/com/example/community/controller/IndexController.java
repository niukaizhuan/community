package com.example.community.controller;

import com.example.community.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/main")
    public String main(HttpSession session) {
        User user =(User) session.getAttribute("USER_SESSION");
        if(user==null){
            return "login";
        }
        return "main";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
}
