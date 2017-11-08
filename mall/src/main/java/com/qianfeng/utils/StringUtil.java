package com.qianfeng.utils;

import java.util.UUID;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
public class StringUtil {
public static String createId(){

    String s = UUID.randomUUID().toString();
    String s1 = s.replaceAll("-", "");
    System.out.println(s1);

    return s1;
}

    public static void main(String[] args) {
        createId();
    }
}
