package com.qianfeng.controller;

import com.qianfeng.beans.Category;
import com.qianfeng.service.CategoryService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/20 0020.
 */
@RestController
public class CategoryController {
@Resource
    private CategoryService cs;
@RequestMapping("findAllCategory")
public List<Category> findAllCategory(){

  return   cs.findAllCategory();
}
@RequestMapping("addCategory")
public String addCategory(Category category){
    cs.addCategory(category);
    System.out.println("123");
    return "1";
}
@RequestMapping("deleteCategory")
public String deleteCategory(@RequestBody ArrayList<Integer> ids){

    cs.deleteCategory(ids);
    return "2";
}
}
