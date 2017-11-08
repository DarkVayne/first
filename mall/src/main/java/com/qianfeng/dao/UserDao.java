package com.qianfeng.dao;

import com.qianfeng.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12 0012.
 */
@Repository
@Mapper
public interface UserDao {
    public List<User> findAllAccount(Map<String,Integer> param);
    public void addUser(User user);
    public void deleteUser2(Integer id);
    public void deleteUser(ArrayList<Integer> ids);
    public void updataUser(User user);
    public int count();
    public User login(User user);

}
