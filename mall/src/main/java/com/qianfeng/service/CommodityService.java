package com.qianfeng.service;

import com.qianfeng.beans.Commodity;
import com.qianfeng.dao.CommodityDao;
import com.qianfeng.utils.StringUtil;
import com.qianfeng.utils.ThreadUtil;
import freemarker.template.Template;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import javax.annotation.Resource;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.List;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
@Service
public class CommodityService {
    @Resource
    private CommodityDao cd;
    @Resource
    private FreeMarkerConfig config;
    @Transactional
    public void addCommodity(final MultipartFile file , Commodity commodity){
        Map<String ,Object>map1=new HashMap<>();
        final String path="d:/b1/"+file.getOriginalFilename();
        map1.put("imagepath",path);
        String id = StringUtil.createId();
        commodity.setSku(id);
        map1.put("csku",id);

        ThreadUtil.saveFile(new Runnable() {
            @Override
            public void run() {
                File target =  new File(path);
                try {
                    file.transferTo(target);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
cd.addCommodity(commodity);
cd.addImage(map1);

    }
    public List<Commodity> findAllCommodity() {
        List<Commodity>list=cd.findAllCommodity();
        return list;
    }
//利用freemarker来创建静态页面
    public void creatHTML(String sku) {

        try {
            Template template = config.getConfiguration().getTemplate("item.ftl");
//            输出文件路径
            FileWriter out=new FileWriter("d:/b1/"+sku+".html");
            //获取数据
            Commodity comm=cd.findComBysku(sku);
            template.process(comm,out);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
