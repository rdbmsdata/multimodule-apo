/**
 * 
 */
package org.multimodule.core.example;

import org.multimodule.core.example.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author x136858
 *
 */
public class Manager {
	
	
	private Employee emp;

	private String managerName;
	private String managerDept;

	public Manager() {
		System.out.println("Initializing manager class..");
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerDept() {
		return managerDept;
	}

	public void setManagerDept(String managerDept) {
		this.managerDept = managerDept;
	}

	public Employee getEmp() {
		return emp;
	}

	@Autowired
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	

}
