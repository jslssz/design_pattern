package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-26 20:44
 * <p>
 * 利用静态内部类的方式，Singleton7在类装载是并不会实例化，而是要在调用获取实例方法时才会去实例化，线程安全,推荐使用
 */
public class Singleton7 {

    private Singleton7() {
    }

    private static class Singleton7GetInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return Singleton7GetInstance.INSTANCE;
    }
}
