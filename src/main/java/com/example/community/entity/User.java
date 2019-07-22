package com.example.community.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String userName;

    private String password;

    private String email;

    private String phone;

    private String qq;

    private String wechat;

    private String microBlog;

    private String type;

    private String state;

}