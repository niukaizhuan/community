package com.example.community.controller;

import com.example.community.entity.User;
import com.example.community.mapper.UserMapper;
import com.example.community.utils.AccessTokenUtil;
import com.example.community.utils.GithubUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Controller
public class AuthorizeController {
/*
    private GithubProvider githubProvider;
    private UserMapper userMapper;

    @Autowired
    public AuthorizeController(GithubProvider githubProvider, UserMapper userMapper) {
        this.githubProvider = githubProvider;
        this.userMapper = userMapper;
    }

    @Value("${github.client.id}")
    private String clientId;

    @Value("${github.client.secret}")
    private String clientSecret;

    @Value("${github.client.uri}")
    private String clientUri;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state,
                           HttpServletRequest request,
                           HttpServletResponse response) {
        AccessTokenUtil accessTokenUtil = new AccessTokenUtil();
        accessTokenUtil.setClient_id(clientId);
        accessTokenUtil.setClient_secret(clientSecret);
        accessTokenUtil.setCode(code);
        accessTokenUtil.setRedirect_uri(clientUri);
        accessTokenUtil.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenUtil);
        GithubUser githubUser = githubProvider.getUser(accessToken);
        System.out.println(githubUser.getName());
        if (githubUser != null) {
            User user = new User();
            String token = UUID.randomUUID().toString();
            user.setToken(token);
            user.setAccountId(String.valueOf(githubUser.getId()));
            user.setName(githubUser.getName());
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(user.getGmtCreate());
            userMapper.insert(user);
            System.out.println(user.getId());
            response.addCookie(new Cookie("token",token));
            //request.getSession().setAttribute("user", githubUser);
            return "redirect:/";
        } else {
            //登录失败,重新登录
            return "redirect:/";
        }*/

    }


