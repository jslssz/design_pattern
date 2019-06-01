package abstractfactory;

import abstractfactory.factory.GreeFactory;
import abstractfactory.factory.HaierFactory;
import abstractfactory.factory.TCLFactory;

/**
 * @author jxlgcmh
 * @create 2019-05-28 11:23
 */
public class Client {
	public static void main(String[] args) {
		ApplianceFactory factory =new TCLFactory();
		AirConditioning airConditioning = factory.createAirConditioning();
		Refrigerator refrigerator = factory.createRefrigerator();
		airConditioning.display();
		refrigerator.display();
	}
}
