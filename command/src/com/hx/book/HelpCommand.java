package com.hx.book;

/**
 * @author jxlgcmh
 * @create 2019-06-01 21:13
 */

public class HelpCommand extends  Command {
	private HelpModel helpModel;
	
	public void setHelpModel(HelpModel helpModel) {
		this.helpModel = helpModel;
	}
	
	@Override
	public void execute() {
		helpModel.action();
	}
}
