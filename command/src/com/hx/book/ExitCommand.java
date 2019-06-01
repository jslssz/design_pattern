package com.hx.book;

/**
 * @author jxlgcmh
 * @create 2019-06-01 21:13
 */
public class ExitCommand extends  Command {
	
	//维护具体执行业务的引用
	
	private ExitModel exitModel;
	public void setExitModel(ExitModel exitModel){
		this.exitModel=exitModel;
	}
	
	
	@Override
	public void execute() {
		exitModel.action();
	}
}
