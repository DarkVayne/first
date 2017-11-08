package com.qianfeng.dao;

import com.qianfeng.beans.Commodity;
import com.qianfeng.beans.Images;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
@Repository
@Mapper
public interface CommodityDao {
    public void addCommodity(Commodity commodity);
    public void addImage(Map<String,Object>map);

    List<Commodity> findAllCommodity();

    Commodity findComBysku(String sku);
}
