package com.hx.book;

/**
 *  具体调用者  Invoker
 * @author jxlgcmh
 * @create 2019-06-01 21:10
 */
public class FunctionButton {
	private Command command;
	public void setCommand(Command command){
		this.command =command;
	}
	
	//具体执行功能
	public void click(){
		System.out.println("单击功能键：");
		command.execute();
	}
	
}
