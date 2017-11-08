package com.qianfeng.controller;

import com.qianfeng.beans.User;
import com.qianfeng.service.UserService;
import com.qianfeng.utils.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12 0012.
 */
@RestController //constroller+responsebody
public class UserController {
    @Autowired
    private UserService us;

    @RequestMapping("findAllAccount")
    public List<User> findAllAccount(int page, int size) {
        Map<String, Integer> param = new HashMap<>();
        param.put("start", (page - 1) * size);
        param.put("size", size);

        return us.findAllAccount(param);
    }

    @RequestMapping("addUser")
    public String addUser(User user) {
        us.addUser(user);
        return "3";

    }

    @RequestMapping("deleteUser2")
    public String deleteUser2(Integer id) {
        us.deleteUser2(id);
        return "3";

    }

    @RequestMapping("deleteUser")
    public String deleteUser(@RequestBody ArrayList<Integer> ids) {
        us.deleteUser(ids);
        return "3";

    }

    @RequestMapping("updateUser")
    public String updateUser(User user) {
        String s = SecurityUtil.encrypt(user.getPwd());
        user.setPwd(s);
        System.out.println(s);
        if (user.getId() == 0) {
            us.addUser(user);
        } else {
            us.updateUser(user);
        }
        return "3";
    }

    @RequestMapping("total")
    public int count() {
        return us.count();
    }

    @RequestMapping("login2")
    public String login(User user, HttpSession session) {
        User u = us.login(user);
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(u.getAccount(), u.getPwd());
            subject.login(token);
            session.setAttribute("user", u);
            return "1";

        } catch (Exception e) {
            return "0";
        }
    }
}


