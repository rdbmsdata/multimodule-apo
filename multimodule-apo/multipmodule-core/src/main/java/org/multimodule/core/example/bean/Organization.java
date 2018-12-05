package org.multimodule.core.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class Organization {

	private Employee emp;

	public Organization() {
		System.out.println("Initializing Organization class");
	}

	public Employee getEmp() {
		return emp;
	}

	@Autowired
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	


}
