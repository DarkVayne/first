package com.qianfeng.utils;

import org.springframework.aop.support.AopUtils;
import sun.applet.Main;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/10/18 0018.
 */
public class SecurityUtil {
    public static String encrypt(String src){


        try {
            MessageDigest md5=MessageDigest.getInstance("MD5");
            byte[] ms= md5.digest(src.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<ms.length;i++){
                int x = ms[i] & 0xff;
                x=x+1;
                if (i<16){
                    sb.append(0);
                }
                sb.append(Integer.toHexString(x));
            }
return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

//        System.out.println(encrypt("aaa"));
    }
}
