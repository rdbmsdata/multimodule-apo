package org.multimodule.core.example.bean;

import org.multimodule.core.example.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 *
 */
@Configuration
public class App {

	private Organization org;

	@Bean
	Organization createOrganization() {
		return new Organization();
	}

	@Bean
	Employee createEmployee() {
		return new Employee();
	}

	@Bean
	Manager createManager() {

		return new Manager();
	}

	public Organization getOrg() {
		return org;
	}

	@Autowired
	public void setOrg(Organization org) {
		this.org = org;
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(App.class);
		ctx.refresh();
		App a = ctx.getBean(App.class);
		Manager m = ctx.getBean(Manager.class);
		m.getEmp().setEmpName("");
		System.out.println(m.getEmp().getEmpName());

	}
}
