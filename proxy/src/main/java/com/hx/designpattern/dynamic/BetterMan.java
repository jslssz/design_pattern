package com.hx.designpattern.dynamic;

/**
 * @author jxlgcmh
 * @date 2019-08-15 14:37
 */
public class BetterMan implements Man {
    @Override
    public String getBelief() {
        return "不会飞";
    }

    @Override
    public void eat(String food) {
        System.out.println("不吃");
    }
}
