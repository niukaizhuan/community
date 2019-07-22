package com.example.community.mapper;


import com.example.community.entity.User;

public interface UserMapper {

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户类
     */
    User selectByUserName(String userName);

    /**
     * 通过手机号查询用户
     *
     * @param phone 手机号
     * @return 用户类
     */
    User selectByPhone(String phone);

    /**
     * 通过邮箱查询用户
     *
     * @param email 邮箱
     * @return 用户类
     */
    User selectByEmail(String email);

    /**
     * 通过qq查询用户
     *
     * @param qq
     * @return
     */
    User selectByQq(String qq);

    /**
     * 通过微信查询用户
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
     * @param user 用户类
     * @return 受影响的行数
     */
    Integer insert(User user);

    Integer deleteById(Integer id);

    User selectById(Integer id);

    Integer updateById(User user);
}