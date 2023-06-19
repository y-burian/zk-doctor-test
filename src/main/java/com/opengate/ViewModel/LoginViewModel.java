package com.opengate.ViewModel;

import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.Executions;

public class LoginViewModel {
	
	
	
	
	@Command
	public void linkRegister() {
		Executions.getCurrent().sendRedirect("/login/register.zul");
		
	}
	
	@Command
	public void linkIndex() {
		Executions.getCurrent().sendRedirect("/index.zul");
	}
	
	

}
