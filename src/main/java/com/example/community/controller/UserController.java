package com.example.community.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.community.entity.User;
import com.example.community.service.impl.UserServiceImpl;
import com.example.community.utils.AES128;
import com.example.community.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    /**
     * 查找用户名是否存在
     * userName 用户名
     *
     * @return exist/null
     */
    @RequestMapping(value = "/checkByName", method = RequestMethod.POST)
    public String checkByName(@RequestBody String str) {
        try {
            JSONObject jsonObject = JSON.parseObject(str);
            User user = userService.selectByUserName(jsonObject.getString("userName"));
            if (user != null) {
                System.out.println(user.toString());
                return ResponseUtil.success("exist");
            } else {
                System.out.println("400");
                return ResponseUtil.success("null");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseUtil.success("null");
        }
    }

    /**
     * 查看手机号码是否匹配用户名
     * phone 手机
     * userName 用户名
     *
     * @return match/mismatch
     */
    @RequestMapping(value = "/checkNameByPhone", method = RequestMethod.POST)
    public String checkNameByPhone(@RequestBody String str) {
        try {
            JSONObject jsonObject = JSON.parseObject(str);
            User user = userService.selectByUserName(jsonObject.getString("userName"));
            if (user == null) {
                return ResponseUtil.success("mismatch");
            }
            if (user.getPhone().equals(jsonObject.getString("phone"))) {
                return ResponseUtil.success("match");
            } else {
                return ResponseUtil.success("mismatch");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查看邮箱是否匹配用户名
     * userName 用户名
     * email    邮箱
     *
     * @return match/mismatch
     */
    @RequestMapping(value = "/checkNameByEmail", method = RequestMethod.POST)
    public String checkNameByEmail(@RequestBody String str) {
        JSONObject jsonObject = JSON.parseObject(str);
        User user = userService.selectByUserName(jsonObject.getString("userName"));
        if (user == null) {
            return ResponseUtil.success("mismatch");
        }
        if (user.getEmail().equals(jsonObject.getString("email"))) {
            return ResponseUtil.success("match");
        } else {
            return ResponseUtil.success("mismatch");
        }
    }

    /**
     * 查看qq是否匹配用户名
     * userName 用户名
     * qq    qq
     *
     * @return match/mismatch
     */
    @RequestMapping(value = "/checkNameByQq", method = RequestMethod.POST)
    public String checkNameByQq(@RequestBody String str) {
        JSONObject jsonObject = JSON.parseObject(str);
        User user = userService.selectByUserName(jsonObject.getString("userName"));
        if (user == null) {
            return ResponseUtil.success("mismatch");
        }
        if (user.getQq().equals(jsonObject.getString("qq"))) {
            return ResponseUtil.success("match");
        } else {
            return ResponseUtil.success("mismatch");
        }
    }

    /**
     * 查看微信是否匹配用户名
     * userName 用户名
     * wechat    微信
     *
     * @return match/mismatch
     */
    @RequestMapping(value = "/checkNameByWechat", method = RequestMethod.POST)
    public String checkNameByWechat(@RequestBody String str) {
        JSONObject jsonObject = JSON.parseObject(str);
        User user = userService.selectByUserName(jsonObject.getString("userName"));
        if (user == null) {
            return ResponseUtil.success("mismatch");
        }
        if (user.getWechat().equals(jsonObject.getString("wechat"))) {
            return ResponseUtil.success("match");
        } else {
            return ResponseUtil.success("mismatch");
        }
    }

    /**
     * 查看微博是否匹配用户名
     * userName 用户名
     * microBlog    微博
     *
     * @return match/mismatch
     */
    @RequestMapping(value = "/checkNameByMicroBlog", method = RequestMethod.POST)
    public String checkNameByMicroBlog(@RequestBody String str) {
        JSONObject jsonObject = JSON.parseObject(str);
        User user = userService.selectByUserName(jsonObject.getString("userName"));
        if (user == null) {
            return ResponseUtil.success("mismatch");
        }
        if (user.getMicroBlog().equals(jsonObject.getString("microBlog"))) {
            return ResponseUtil.success("match");
        } else {
            return ResponseUtil.success("mismatch");
        }
    }

    /**
     * 查找手机号是否存在
     * phone 手机号
     *
     * @return exist 存在 null 不存在
     * @throws Exception
     */
    @RequestMapping(value = "/findByPhone", method = RequestMethod.POST)
    public String findByPhone(@RequestBody String str) {
        JSONObject jsonObject = JSON.parseObject(str);
        User user = userService.selectByPhone(jsonObject.getString("phone"));
        if (user != null) {
            return ResponseUtil.success("exist");
        } else {
            return ResponseUtil.success("null");
        }
    }

    /**
     * 查找邮箱是否存在
     * email 邮箱
     *
     * @return exist 存在 null 不存在
     * @throws Exception
     */
    @RequestMapping(value = "/findByEmail", method = RequestMethod.POST)
    public String findByEmail(@RequestBody String str) {
        JSONObject jsonObject = JSON.parseObject(str);
        User user = userService.selectByEmail(jsonObject.getString("email"));
        if (user != null) {
            return ResponseUtil.success("exist");
        } else {
            return ResponseUtil.success("null");
        }
    }

    /**
     * 查找qq是否存在
     * qq qq
     *
     * @return exist 存在 null 不存在
     * @throws Exception
     */
    @RequestMapping(value = "/findByQq", method = RequestMethod.POST)
    public String findByQq(@RequestBody String str) {
        JSONObject jsonObject = JSON.parseObject(str);
        User user = userService.selectByQq(jsonObject.getString("qq"));
        if (user != null) {
            return ResponseUtil.success("exist");
        } else {
            return ResponseUtil.success("null");
        }
    }

    /**
     * 查找微信是否存在
     * WeChat 微信
     *
     * @return exist 存在 null 不存在
     * @throws Exception
     */
    @RequestMapping(value = "/findByWechat", method = RequestMethod.POST)
    public String findByWechat(@RequestBody String str) {
        JSONObject jsonObject = JSON.parseObject(str);
        User user = userService.selectByWechat(jsonObject.getString("wechat"));
        if (user != null) {
            return ResponseUtil.success("exist");
        } else {
            return ResponseUtil.success("null");
        }
    }

    /**
     * 查找微博是否存在
     * microBlog 微博
     *
     * @return exist 存在 null 不存在
     * @throws Exception
     */
    @RequestMapping(value = "/findByMicroBlog", method = RequestMethod.POST)
    public String findByMicroBlog(@RequestBody String str) {
        JSONObject jsonObject = JSON.parseObject(str);
        User user = userService.selectByMicroBlog(jsonObject.getString("microBlog"));
        if (user != null) {
            return ResponseUtil.success("exist");
        } else {
            return ResponseUtil.success("null");
        }
    }

    /**
     * 账号登录
     * userName 账号
     * password 密码
     * request
     *
     * @return account 账户类 fail 失败 success 成功
     */
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String login(@RequestBody String str, HttpSession session) {
        try {
            JSONObject jsonObject = JSON.parseObject(str);
            // 获取用户输入的账户名和密码
            String userName = jsonObject.getString("username");
            String password = jsonObject.getString("password");
            // 将密码加密
            String encryptPassword = AES128.encrypt(password, userName);
            // 通过用户名找到对应用户
            User user = userService.selectByUserName(userName);
            System.out.println(encryptPassword);
            if (user == null) {
                // 用户名不存在
                return ResponseUtil.error(400, "用户名不存在");
            }
            // 用户名存在
            // 将数据库中的密码和当前用户输入的密码比较
            if (!user.getPassword().equals(encryptPassword)) {
                // 用户名密码不匹配
                return ResponseUtil.error(400, "密码错误");
            }
            // 用户信息放入拦截器，权限管理
            session.setAttribute("USER_SESSION", user);
            return ResponseUtil.success("success");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseUtil.error(400, "操作失败");
        }
    }

    /**
     * 注册
     *
     * @return success/fail
     * @Param str
     */
    @PostMapping("/userRegister")
    public String Register(@RequestBody User user, HttpSession session) {
        try {
            // 判断是手机注册还是邮箱注册

            // 将密码加密
            String encryptPassword = AES128.encrypt(user.getPassword(), user.getUserName());
            user.setPassword(encryptPassword);
            // 向数据库插入值
            user.setType("S");
            System.out.println(user.toString());
            userService.insert(user);
            return ResponseUtil.success("success");
        } catch (Exception e) {
            e.printStackTrace();
            return "操作失败!";
        }
    }

    /**
     * 忘记密码
     * phone    手机号
     * userName 账号
     * password 密码
     *
     * @return success/fail
     */
    @RequestMapping(value = "/forgetPwdByPhone", method = RequestMethod.POST)
    public String forgetPwdByPhone(@RequestBody String str, HttpSession session) {
        JSONObject jsonObject = JSON.parseObject(str);
        // 1,判断用户提交的手机号码和获取短信的手机号码是否相同
        String smsPhone = (String) session.getAttribute("forgetPwdPhone");
        if (!smsPhone.equals(jsonObject.get("phone"))) {
            return ResponseUtil.success("phoneError");
        }
        // 通过用户名找到对应用户
        User user = userService.selectByUserName(jsonObject.getString("userName"));
        // 使用MD5给密码用户输入的密码加密
        String encryptPassword = AES128.encrypt(jsonObject.getString("password"), jsonObject.getString("userName"));
        // 2，判断新密码与旧密码是否相同
        if (encryptPassword.equals(user.getPassword())) {
            return ResponseUtil.success("pwdError");
        }
        // 与旧密码不相同，重置密码
        user.setPassword(encryptPassword);
        // 3,修改密码,并返回
        userService.updateById(user);
        return ResponseUtil.success("success");
    }

    /**
     * 修改密码
     * password 新密码
     *
     * @return success/fail
     */
    @RequestMapping(value = "/changePwd", method = RequestMethod.POST)
    public String changePwd(@RequestBody String str, HttpSession session) {
        try {
            User user = (User) session.getAttribute("USER_SESSION");
            JSONObject jsonObject = JSON.parseObject(str);
            // 使用MD5给密码用户输入的密码加密
            String encryptPassword = AES128.encrypt(jsonObject.getString("password"), jsonObject.getString("userName"));
            // 2，判断新密码与旧密码是否相同
            if (encryptPassword.equals(user.getPassword())) {
                return ResponseUtil.success("pwdError");
            }
            // 给用户输入的密码加密
            // 2，判断新密码与旧密码是否相同
            user.setPassword(encryptPassword);
            userService.updateById(user);
            // 3,修改密码
            // 4,判断是否修改成功
            return ResponseUtil.success("success");
        } catch (Exception e) {
            e.printStackTrace();
            return "操作失败!";
        }
    }

    /**
     * 用户退出
     * request session信息
     *
     * @return success/fail
     */
    @RequestMapping(value = "/exit", method = RequestMethod.GET)
    public void exit(HttpServletRequest request, HttpSession session) {
        // 移除session中用户信息
        session.removeAttribute("USER_SESSION");
    }

}
