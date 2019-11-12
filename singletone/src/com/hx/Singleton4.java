package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-26 20:44
 * 懒汉式：同步方法，线程安全
 * 缺点：每次获取实例都要同步方法，虽然线程安全，但效率太低
 */
public class Singleton4 {


    private static Singleton4 instance = null;

    private Singleton4() {
    }


    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
