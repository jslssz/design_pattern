package com.hx.designpattern.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author jxlgcmh
 * @date 2019-08-15 14:22
 */
public class ProxyFactory {
    /**
     *  获取代理类对象
     * @param object 被代理类对象
     * @return 代理类对象
     */
    public static Object getProxyInstance(Object object) {

        MyInvocationHandler handler =new MyInvocationHandler();

        // 特别注意  必须绑定,否则报错
        handler.bind(object);

        /*
         * @param   loader the class loader to define the proxy class
         * @param   interfaces the list of interfaces for the proxy class
         *          to implement
         * @param   h the invocation handler to dispatch method invocations to
         * @return  a proxy instance with the specified invocation handler of a
         *          proxy class that is defined by the specified class loader
         *          and that implements the specified interfaces
         */

        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),handler);
    }
}
