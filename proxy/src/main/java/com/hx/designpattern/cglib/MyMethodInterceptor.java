package com.hx.designpattern.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author jxlgcmh
 * @date 2019-09-21 21:34
 */
public class MyMethodInterceptor implements MethodInterceptor {
    /**
     *
     * @param sub cglib生成的代理对象
     * @param method 被代理的对象和方法
     * @param objects 方法入参
     * @param methodProxy 代理方法
     * @return 
     * @throws Throwable
     */
    @Override
    public Object intercept(Object sub, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("======插入前置通知======");
        Object object = methodProxy.invokeSuper(sub, objects);
        System.out.println("======插入后者通知======");
        return object;
    }
 }