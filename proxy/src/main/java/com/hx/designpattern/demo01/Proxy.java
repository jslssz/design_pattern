package com.hx.designpattern.demo01;

/**
 * Created by Minghua Chen on 2019/3/12.
 * add jxust-nc
 */
public class Proxy extends Subject {
    private RealSubject realSubject=new RealSubject();

    public void preRequest(){

    }
    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void postRequest(){

    }
}
