package factorymethod;

/**
 * @author jxlgcmh
 * @create 2019-05-28 10:38
 */
public class FileLogger implements Logger{
	@Override
	public void writeLog() {
		System.out.println("记录文件日志");
	}
}
