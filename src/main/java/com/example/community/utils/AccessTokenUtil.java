package com.example.community.utils;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;

@Data//自动创建set get方法
public class AccessTokenUtil {

    private String client_id;

//    @NotBlank(message = "不能为空")
    private String client_secret;

    private String code;

    private String redirect_uri;

    private String state;

}
