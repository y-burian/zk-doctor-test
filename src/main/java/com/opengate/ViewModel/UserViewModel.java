package com.opengate.ViewModel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Init;

import com.opengate.Entity.User;
import com.opengate.Entity.UserUtil;

public class UserViewModel {

	// Util
	UserUtil util = new UserUtil();

	User currentUser;
	List<User> list = new ArrayList<>();

	@Init
	public void init() {
		list = util.getList();
		currentUser = list.get(0);

	}

	public UserUtil getUtil() {
		return util;
	}

	public void setUtil(UserUtil util) {
		this.util = util;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}
	
	

}
