package factorymethod;

/**
 * @author jxlgcmh
 * @create 2019-05-28 10:40
 */
public interface LoggerFactory {
	/**
	 * 创建工厂
	 * @return  返回工厂
	 */
	Logger createLogger();
}
