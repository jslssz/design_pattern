package com.hx.book;

/**
 * @author jxlgcmh
 * @create 2019-06-01 21:24
 */
public class Client {
	public static void main(String[] args) {
		FunctionButton button =new FunctionButton();
		ExitCommand command =new ExitCommand();
		command.setExitModel(new ExitModel());
		button.setCommand(command);
		button.click();
	}
}
