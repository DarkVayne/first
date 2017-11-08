package com.qianfeng.beans;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
public class Images implements Serializable {
    private int id;
    private String imagepath;
    private String csku;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getCsku() {
        return csku;
    }

    public void setCsku(String csku) {
        this.csku = csku;
    }
}
