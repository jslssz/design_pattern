package com.hx.designpattern.dynamic;

/**
 * @author jxlgcmh
 * @date 2019-08-15 14:31
 */
public class Client {
    public static void main(String[] args) {
        // 被代理类对象
//        SuperMan superMan =new SuperMan();
        BetterMan betterMan = new BetterMan();
        Man proxyInstance = (Man) ProxyFactory.getProxyInstance(betterMan);
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("牛肉汤!");

    }
}
