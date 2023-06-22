package com.opengate.ViewModel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Messagebox;

import com.opengate.Entity.Doctor;
import com.opengate.Util.AppointmentUtil;

public class DoctorViewModel {
	
	
	private List<Doctor> list=new ArrayList<>();
	private Doctor selectedDoctor;
	private StringBuilder strBuilder=new StringBuilder();
	
	@Init
	public void init() {
		
		list.add(new Doctor("Test", "TestLastname", "ASDFGHJIYTHGN346", "+39 345 345 556", "8:00-15:00", "/images/doctor-example.jpg","test@email.test"));
		list.add(new Doctor("Hello", "World", "ASDFGHJIYTHGN346", "+39 345 345 556", "8:00-15:00", "/images/doctor-example.jpg","test@email.test"));
		list.add(new Doctor("World", "Hello", "ASDFGHJIYTHGN346", "+39 345 345 556", "8:00-15:00", "/images/doctor-example.jpg","test@email.test"));
		list.add(new Doctor("Enzo", "Puccio", "ASDFGHJIYTHGN346", "+39 345 345 556", "8:00-15:00", "/images/doctor-example.jpg","test@email.test"));
		list.add(new Doctor("Gino", "Vince", "ASDFGHJIYTHGN346", "+39 345 345 556", "8:00-15:00", "/images/doctor-example.jpg","test@email.test"));
		list.add(new Doctor("Jiove", "Pluto", "ASDFGHJIYTHGN346", "+39 345 345 556", "8:00-15:00", "/images/doctor-example.jpg","test@email.test"));
		list.add(new Doctor("Pino", "Collaudo", "ASDFGHJIYTHGN346", "+39 345 345 556", "8:00-15:00", "/images/doctor-example.jpg","test@email.test"));

	}

	public List<Doctor> getList() {
		return list;
	}
	
	@Command
	@NotifyChange("selectedDoctor")
	public void selectDoctor() {
		
		Messagebox.show((strBuilder.append("Sei sicuro di voler selezionare ")
						.append(selectedDoctor.getName()).append(selectedDoctor.getLastName())
						.append(" \nPotrai cambiare il medico nel profilo").toString()),
				
				"Seleziona Dottore", Messagebox.OK | Messagebox.CANCEL, Messagebox.QUESTION,
				new org.zkoss.zk.ui.event.EventListener() {
					public void onEvent(Event evt) throws InterruptedException {
						if (evt.getName().equals("onOK")) {
							Executions.getCurrent().sendRedirect("/"); //TODO: make it better
						} else {
							strBuilder.delete(0, strBuilder.length());
							Clients.showNotification("Selezione cancellata");
							
						}
					}
				});
				
				
				
			
	
	}

	public Doctor getSelectedDoctor() {
		return selectedDoctor;
	}

	public void setSelectedDoctor(Doctor selectedDoctor) {
		this.selectedDoctor = selectedDoctor;
	}
	
	
	
	

}
