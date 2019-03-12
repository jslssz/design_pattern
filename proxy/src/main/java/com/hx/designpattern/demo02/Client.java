package com.hx.designpattern.demo02;

/**
 * Created by Minghua Chen on 2019/3/12.
 * add jxust-nc
 */
public class Client {
    public static void main(String[] args){
      Searcher searcher=new ProxySearcher();
        searcher.doSearch("杨过", "小龙女");
    }
}
