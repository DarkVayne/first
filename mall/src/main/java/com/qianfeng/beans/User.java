package com.qianfeng.beans;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/10/12 0012.
 */
@Component
public class User implements Serializable{
    private int id;
    private String account;
    private String pwd;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public String getPwd() {
        return pwd;

    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User() {
    }

    public User(String account, String pwd) {
        this.account = account;
        this.pwd = pwd;

    }

}

