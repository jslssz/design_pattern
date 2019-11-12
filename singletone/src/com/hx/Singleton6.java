package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-26 20:44
 * <p>
 * 双重检查机制，线程安全,推荐使用
 */
public class Singleton6 {

    private static volatile Singleton6 instance = null;

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }

        }
        return instance;
    }
}
