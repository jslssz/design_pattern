package com.hx.designpattern.demo02;

/**
 * Created by Minghua Chen on 2019/3/12.
 * add jxust-nc
 */

/**
 * 身份验证类
 */
public class AccessValidator {
    public boolean validator(String userId) {
        System.out.println("数据库中验证"+userId+"是否合法");
        if (userId.equals("杨过")){
            System.out.println(userId+" : 登录成功");
            return true;
        }else {
            System.out.println(userId + " : 登录失败");
            return false;
        }
    }
}
