package com.hx.designpattern.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author jxlgcmh
 * @date 2019-09-21 21:47
 */
public class Client {
    public static void main(String[] args) {
        // 通过CGLib动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(HelloService.class);
        // 设置回调对象
        enhancer.setCallback(new MyMethodInterceptor());
        HelloService proxy = (HelloService) enhancer.create();
        proxy.sayHello();
    }
}
