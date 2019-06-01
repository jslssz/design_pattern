package abstractfactory;

/**
 * 家电工厂
 * @author jxlgcmh
 * @create 2019-05-28 11:19
 */
public interface ApplianceFactory {
	/**
	 * 创建空调
	 * @return
	 */
	AirConditioning createAirConditioning();
	
	/**
	 * 创建冰箱
	 * @return
	 */
	Refrigerator createRefrigerator();
}
