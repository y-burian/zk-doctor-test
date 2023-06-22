package com.opengate.Entity;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserUtil {

	List<User> list = new ArrayList<>();

	public UserUtil() {
		list.add(new User("Luigi", "Verdi", "verdi@gmail.com", "ABSDASD123ASD", "123456678", new Date(1988, 10, 10)));
		list.get(0).setDoctorSelected(true);

	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

}
