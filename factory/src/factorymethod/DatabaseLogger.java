package factorymethod;

/**
 * @author jxlgcmh
 * @create 2019-05-28 10:38
 */
public class DatabaseLogger implements Logger{
	@Override
	public void writeLog() {
		System.out.println("记录数据库日志");
	}
}
