package com.qianfeng.controller;

import com.qianfeng.beans.Commodity;
import com.qianfeng.beans.Images;
import com.qianfeng.service.CommodityService;
import com.qianfeng.utils.Constants;
import com.qianfeng.utils.StringUtil;
import com.qianfeng.utils.ThreadUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
@RestController
public class CommodityController {
    @Resource
    private CommodityService cs;
    @RequestMapping("addCommodity")
    public String addCommodity(@RequestParam("f1") final MultipartFile file , Commodity commodity){

        cs.addCommodity(file,commodity);

        return Constants.RESULT_OK;
    }
    @RequestMapping("findAllCommodity")
    public List<Commodity>findAllCommodity(){
List<Commodity>list=cs.findAllCommodity();
        return list;
    }
    @RequestMapping("shangjia")
    public String shangjia(String sku){
        cs.creatHTML(sku);
        return Constants.RESULT_OK;
    }
}
