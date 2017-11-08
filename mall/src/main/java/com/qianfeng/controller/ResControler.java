package com.qianfeng.controller;

import com.qianfeng.beans.Res;
import com.qianfeng.beans.User;
import com.qianfeng.service.ResService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/10/16 0016.
 */
@RestController
public class ResControler {
    @Resource
    private ResService rs;
    @RequestMapping("findAllResmain")
    public List<Res> findAllRes(HttpSession session){
        User user= (User) session.getAttribute("user");
        return  rs.findAllRes(user.getId());
    }
    @RequestMapping("findAllRes")
    public List<Res> findAllRes1(){

        return  rs.findAllResForRole();
    }

}
