package com.qianfeng.dao;

import com.qianfeng.beans.Res;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/10/16 0016.
 */
@Repository
@Mapper
public interface ResDao {
    public List<Res> findAllResForRole();
    public List<Res> findAllRes(int userid);
}

