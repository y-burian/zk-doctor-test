package com.opengate.ViewModel;

import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.Executions;

public class RegisterViewModel {
	
	
	
	@Command
	public void linkLogin() {
		
		Executions.getCurrent().sendRedirect("/login/login.zul");
		
	}
	
	@Command
	public void linkCompleteProfile() {
		Executions.getCurrent().sendRedirect("/login/complete-profile.zul");
	}
	
	@Command
	public void linkMainPage() {
		Executions.getCurrent().sendRedirect("/");
	}
	
}
