package com.example.community.service.impl;

import com.example.community.entity.User;
import com.example.community.mapper.UserMapper;
import com.example.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }

    @Override
    public User selectByPhone(String phone) {
        return userMapper.selectByPhone(phone);
    }

    @Override
    public User selectByEmail(String email) {
        return userMapper.selectByEmail(email);
    }

    @Override
    public User selectByQq(String qq) {
        return userMapper.selectByQq(qq);
    }

    @Override
    public User selectByWechat(String wechat) {
        return userMapper.selectByWechat(wechat);
    }

    @Override
    public User selectByMicroBlog(String microBlog) {
        return userMapper.selectByMicroBlog(microBlog);
    }

    @Override
    public String insert(User user) {
        if (userMapper.insert(user) > 0) {
            return "success";
        } else {
            return "fail";
        }
    }

    @Override
    public String updateById(User user) {
        if (userMapper.updateById(user) > 0) {
            return "success";
        } else {
            return "fail";
        }
    }

    @Override
    public String delete(Integer id) {
        if (userMapper.deleteById(id) > 0) {
            return "success";
        } else {
            return "fail";
        }
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }
}
