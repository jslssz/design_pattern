package com.hx.designpattern.demo02;

/**
 * Created by Minghua Chen on 2019/3/12.
 * add jxust-nc
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String keyWord) {
        System.out.println("用户："+userId+"使用 ： "+keyWord+ "关键字查询信息");
        return "具体内容";
    }
}
