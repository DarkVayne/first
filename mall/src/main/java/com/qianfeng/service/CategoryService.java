package com.qianfeng.service;

import com.qianfeng.beans.Category;
import com.qianfeng.dao.CategoryDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/20 0020.
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryDao cd;
    public List<Category> findAllCategory(){
    return cd.findAllCategory();
    }
    public void addCategory(Category category){
        cd.addCategory(category);
    }
    public void deleteCategory(ArrayList<Integer> ids){
        cd.deleteCategory(ids);
    }
}
