package com.qianfeng.service;

import com.qianfeng.beans.User;
import com.qianfeng.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12 0012.
 */
@Service
public class UserService {
    @Resource
    private UserDao ud;

    public List<User> findAllAccount(Map<String,Integer> param){

        return ud.findAllAccount(param);
    }
    public void addUser(User user){
ud.addUser(user);

    }
    public void deleteUser2(Integer id){

        ud.deleteUser2(id);
    }
    public void deleteUser(ArrayList<Integer> ids){

        ud.deleteUser(ids);
    }
    public void updateUser(User user){
        ud.updataUser(user);
    }
    public int count(){

        return ud.count();
    }
    public User login(User user){

        return ud.login(user);

    }
}
