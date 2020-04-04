package com.dev.GUI_Programming;

import java.util.EventObject;

public class FormEvent extends EventObject {

	private String name;
	private String jobRole;
	
	public FormEvent(Object source) {
		super(source);
	}
	
	public FormEvent(Object source,String name,String jobRole) {
		super(source);
		this.name = name;
		this.jobRole  = jobRole;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

}
