package com.qianfeng.service;

import com.qianfeng.beans.Res;
import com.qianfeng.dao.ResDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/10/16 0016.
 */
@Service
public class ResService  {
    @Resource
    private ResDao resDao;
    public List<Res> findAllResForRole(){
        return  resDao.findAllResForRole();
    }
    public List<Res> findAllRes(int userid){
        return  resDao.findAllRes(userid);
    }

}
