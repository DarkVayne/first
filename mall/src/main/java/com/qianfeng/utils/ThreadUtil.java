package com.qianfeng.utils;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
public class ThreadUtil {
    static ExecutorService es;
    static {
        System.out.println("创建了线程池");
        es= Executors.newFixedThreadPool(5);
    };
    public static void saveFile(Runnable r ){

es.execute(r);

    }
}
