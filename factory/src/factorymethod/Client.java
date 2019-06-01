package factorymethod;

/**
 * @author jxlgcmh
 * @create 2019-05-28 10:43
 */
public class Client {
	public static void main(String[] args) {
		LoggerFactory factory =new FileLoggerFactory();
		Logger logger =factory.createLogger();
		logger.writeLog();
	}
}
