package com.hx.designpattern.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  实现InvocationHandler接口
 * @author jxlgcmh
 * @date 2019-08-15 14:27
 */
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 需要使用被代理类的对象进行赋值
     */
    private Object obj;

    /**
     * 类似于绑定
     * @param obj
     */
    public void bind(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retVal = method.invoke(obj, args);
        return retVal;
    }
}
