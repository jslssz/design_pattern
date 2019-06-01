package factorymethod;

/**
 * @author jxlgcmh
 * @create 2019-05-28 10:41
 */
public class FileLoggerFactory implements LoggerFactory {
	@Override
	public Logger createLogger() {
		return new FileLogger();
	}
}
