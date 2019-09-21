package com.hx.designpattern.cglib;

/**
 * @author jxlgcmh
 * @date 2019-09-21 21:28
 */
public class HelloService {
    public HelloService() {
        System.out.println("HelloService 构造方法");
    }

    /**
     * 此方法不能被覆盖，CGlib无法代理由final修饰的方法
     *
     * @param string
     * @return
     */
    public final String saySomething(String string) {
        System.out.println("调用SaySomething（）方法");
        return string;
    }

    public void sayHello() {
        System.out.println("hello cglib");
    }


}
