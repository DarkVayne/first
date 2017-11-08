package com.qianfeng.dao;

import com.qianfeng.beans.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/20 0020.
 */
@Repository
@Mapper
public interface CategoryDao {
public List<Category> findAllCategory();
@CacheEvict(value = "category",allEntries = true)
public void addCategory(Category category);
    @CacheEvict(value = "category",allEntries = true)
public void deleteCategory(ArrayList<Integer> ids);
}
