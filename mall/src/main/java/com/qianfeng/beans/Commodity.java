package com.qianfeng.beans;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
public class Commodity {
    private String sku;
    private String commname;
    private float price;
    private String liangdian;
    private String comcontent;

    public String getComcontent() {
        return comcontent;
    }

    public void setComcontent(String comcontent) {
        this.comcontent = comcontent;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCommname() {
        return commname;
    }

    public void setCommname(String commname) {
        this.commname = commname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLiangdian() {
        return liangdian;
    }

    public void setLiangdian(String liangdian) {
        this.liangdian = liangdian;
    }
}
