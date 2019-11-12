package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-26 20:44
 * <p>
 * 枚举的方式
 */
public class Singleton8 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 ==instance2);
    }
}
enum Singleton{
    /**
     * 实例
     */
    INSTANCE;
}
