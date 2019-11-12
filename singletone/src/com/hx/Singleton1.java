package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-26 20:44
 * <p>
 * 饿汉式：静态常量的方式实现单例，线程安全
 * 缺点：在类装载的时候就实例化，没有达到懒加载效果，如果这个实例一直未使用，则会造成内存浪费
 */
public class Singleton1 {


    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }


    public static Singleton1 getInstance() {
        return instance;
    }
}
