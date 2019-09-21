package com.hx.designpattern.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author jxlgcmh
 * @date 2019-09-21 21:53
 */
public class Client2 {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SayHiImpl.class);
        enhancer.setCallback(new MyMethodInterceptor());
        SayHiImpl proxy = (SayHiImpl) enhancer.create();
        proxy.sayHi();
    }
}
