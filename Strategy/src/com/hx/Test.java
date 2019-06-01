package com.hx;

import com.hx.bean.Duck;
import com.hx.bean.FyDuck;
import com.hx.bean.QyDuck;
import com.hx.bean.ZsDuck;
import com.hx.interfacedemo.impl.BigBray;
import com.hx.interfacedemo.impl.FastFly;
import com.hx.interfacedemo.impl.SlowFly;
import com.hx.interfacedemo.impl.SmallBray;

/**
 * @author jxlgcmh
 * @create 2019-05-22 14:28
 */
public class Test {
	public static void main(String[] args) {
		Duck fyDuck = new FyDuck();
		fyDuck.setFly(new FastFly());
		fyDuck.setBray(new BigBray());
		fyDuck.show();
		fyDuck.getFly();
		fyDuck.getBray();
		fyDuck.swimming();
		Duck qyDuck = new QyDuck();
		qyDuck.setBray(new SmallBray());
		qyDuck.setFly(new SlowFly());
		qyDuck.show();
		qyDuck.getFly();
		qyDuck.getBray();
		qyDuck.swimming();
		/**
		 * 我是放养的鸭子
		 * i am fly fast
		 * bray loudly
		 * i am swimming
		 * 我是圈养的鸭子
		 * i am fly slow
		 * small loudly
		 * i am swimming
		 */
		System.out.println("==========分割线=======");
		Duck zsDuck =new ZsDuck();
		zsDuck.show();
		
//		zsDuck.setBray(new BigBray());
//		zsDuck.getBray();
		
		//按道理煮熟的鸭子不会飞，不会叫，更不会游泳
		//下面这些方法应该对齐隐藏不可见
		
//		zsDuck.swimming();
//		zsDuck.getFly();
//		zsDuck.getBray();
		
		/**
		 * ==========分割线=======
		 * 我是煮熟的鸭子，不会飞，不会叫
		 * i am swimming
		 * Exception in thread "main" java.lang.NullPointerException
		 * 	at com.hx.Duck.getFly(Duck.java:24)
		 * 	at com.hx.Test.main(Test.java:33)
		 */
		
		
	}
}
