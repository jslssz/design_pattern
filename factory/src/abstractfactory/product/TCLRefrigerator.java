package abstractfactory.product;

import abstractfactory.Refrigerator;

/**
 * @author jxlgcmh
 * @create 2019-05-28 11:12
 */
public class TCLRefrigerator implements Refrigerator {
	@Override
	public void display() {
		System.out.println("我是《TCL》家生产的冰箱");
	}
}
