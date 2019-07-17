package com.example.community.controller;

import com.example.community.utils.AccessTokenUtil;
import com.example.community.utils.GithubUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;
    @Value("${github.client.id}")
    private String clientId;
    @Value("${github.client.secret}")
    private String clientSecret;
    @Value("${github.client.uri}")
    private String clientUri;
    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state) {
        AccessTokenUtil accessTokenUtil = new AccessTokenUtil();
        accessTokenUtil.setClient_id(clientId);
        accessTokenUtil.setClient_secret(clientSecret);
        accessTokenUtil.setCode(code);
        accessTokenUtil.setRedirect_uri(clientUri);
        accessTokenUtil.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenUtil);
        GithubUser githubUser = githubProvider.getUser(accessToken);
        System.out.println(githubUser.getName());
        return "index";
    }

}
