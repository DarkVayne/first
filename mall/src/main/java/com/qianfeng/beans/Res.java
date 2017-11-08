package com.qianfeng.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/10/16 0016.
 */
public class Res implements Serializable {
    private int id;
    private String text;
    private Set<Res> children=new HashSet<>();

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    private String url;
    private int pid;
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Set<Res> getChildren() {
        return children;
    }

    public void setChildren(Set<Res> children) {
        this.children = children;
    }
}
