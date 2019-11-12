package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-26 20:44
 * 懒汉式：线程不安全
 */
public class Singleton3 {


    private static Singleton3 instance = null;

    private Singleton3() {
    }


    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
