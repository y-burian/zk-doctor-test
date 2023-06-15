package com.opengate.Util;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;

public class PageConfig {

	public List<Page> links = new ArrayList<>();
	private String includeSrc="/home.zul";

	public PageConfig() {

		links.add(new Page("/home.zul", "Home", "z-icon-home"));
		links.add(new Page("/appointment/new-appointment.zul", "Prenota ora", "z-icon-stethoscope"));
		links.add(new Page("/appointment/appointments.zul", "I miei appuntamenti", "z-icon-calendar"));
		links.add(new Page("/profile/profile.zul", "Profilo", "z-icon-address-card"));

	}



	@GlobalCommand
	@NotifyChange("includeSrc")
	public void redirect(@BindingParam("page") Page page) {
		String locationUri = page.getUri();
		String label = page.getLabel();

		if (locationUri.startsWith("http")) {
			Executions.getCurrent().sendRedirect(locationUri);
		} else {

			includeSrc = locationUri;

			if (label != null) {
				Executions.getCurrent().getDesktop().setBookmark("p_" + label);
			}

		}

	}

	public List<Page> getLinks() {
		return links;
	}

	public void setLinks(List<Page> links) {
		this.links = links;
	}

	public String getIncludeSrc() {
		return includeSrc;
	}


	
	
	
	

}
