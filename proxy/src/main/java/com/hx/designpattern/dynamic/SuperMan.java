package com.hx.designpattern.dynamic;

/**
 * @author jxlgcmh
 * @date 2019-08-15 14:21
 */
public class SuperMan implements Man {
    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}
