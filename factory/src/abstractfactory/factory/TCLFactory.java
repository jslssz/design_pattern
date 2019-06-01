package abstractfactory.factory;

import abstractfactory.AirConditioning;
import abstractfactory.ApplianceFactory;
import abstractfactory.Refrigerator;
import abstractfactory.product.TCLConditioning;
import abstractfactory.product.TCLRefrigerator;

/**
 * @author jxlgcmh
 * @create 2019-05-28 11:23
 */
public class TCLFactory implements ApplianceFactory {
	@Override
	public AirConditioning createAirConditioning() {
		return new TCLConditioning();
	}
	
	@Override
	public Refrigerator createRefrigerator() {
		return new TCLRefrigerator();
	}
}
