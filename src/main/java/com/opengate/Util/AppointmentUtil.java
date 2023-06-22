package com.opengate.Util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AppointmentUtil {

	public static String formatTime(LocalTime time) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		return time.format(formatter);

	}

}
