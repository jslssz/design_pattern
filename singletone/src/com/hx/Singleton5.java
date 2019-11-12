package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-26 20:44
 * 懒汉式：同步代码块，线程不安全，不能使用
 * 缺点：线程不安全
 */
public class Singleton5 {


    private static Singleton5 instance = null;

    private Singleton5() {
    }


    public static  Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
