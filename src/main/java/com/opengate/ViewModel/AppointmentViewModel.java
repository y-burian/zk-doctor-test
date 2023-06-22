package com.opengate.ViewModel;

import java.time.LocalDate;
import java.time.LocalTime;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Messagebox;

import com.opengate.Entity.Appointment;
import com.opengate.Util.AppointmentUtil;

public class AppointmentViewModel {

	Appointment test = new Appointment();
	StringBuilder strBuilder = new StringBuilder();

	@Init
	public void init() {

		test.setDayOfWeek(LocalDate.of(2023, 10, 10));
		test.setTime(LocalTime.now());
		test.setDescription("BackPain");

	}

	@Command
	public void addAppointment() {
		int answ;

		Messagebox.show(
				(strBuilder.append("Riepilogo della visita \n Medico di riferimento: ").append("Pino Collaudo \n")
						.append("Data: ").append(test.getDayOfWeek().toString()).append(" Orario: ")
						.append(AppointmentUtil.formatTime(test.getTime())).append(" - ")
						.append(AppointmentUtil.formatTime(test.getTime().plusMinutes(15))).append("\nMotivo: \n")
						.append(test.getDescription()).toString()),
				"Confirm Dialog", Messagebox.OK | Messagebox.IGNORE | Messagebox.CANCEL, Messagebox.QUESTION,
				new org.zkoss.zk.ui.event.EventListener() {
					public void onEvent(Event evt) throws InterruptedException {
						if (evt.getName().equals("onOK")) {
							Executions.getCurrent().sendRedirect("/"); //TODO: make it better
						} else {
							strBuilder.delete(0, strBuilder.length());
							Clients.showNotification("Appuntamento cancellato");
						}
					}
				});

	}

	public Appointment getTest() {
		return test;
	}

	public void setTest(Appointment test) {
		this.test = test;
	}

}
