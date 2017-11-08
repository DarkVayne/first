package com.qianfeng.beans;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/10/20 0020.
 */
public class Category implements Serializable {
    private int id;
    private String categoryname;
    private int pid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
