package com.example.community.service;

import com.example.community.entity.User;

public interface UserService {
    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户
     */
    User selectByUserName(String userName);

    /**
     * 通过手机号查询用户
     *
     * @param phone 手机号
     * @return 用户
     */
    User selectByPhone(String phone);

    /**
     * 通过邮箱查询用户
     *
     * @param email 邮箱
     * @return 用户
     */
    User selectByEmail(String email);

    /**
     * 通过QQ查找用户
     *
     * @param qq
     * @return
     */
    User selectByQq(String qq);

    /**
     * 通过微信查找用户
     *
     * @param wechat
     * @return
     */
    User selectByWechat(String wechat);

    /**
     * 通过微博查询用户
     *
     * @param microBlog
     * @return
     */
    User selectByMicroBlog(String microBlog);

    /**
     * 添加用户
     *
     * @param user String
     * @return success/fail
     */
    String insert(User user);

    /**
     * 更新用户信息
     *
     * @param user String
     * @return success/fail
     */
    String updateById(User user);

    String delete(Integer id);

    User selectById(Integer id);
}
