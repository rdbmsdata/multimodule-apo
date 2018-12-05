/**
 * 
 */
package org.multimodule.core.example.bean;

/**
 * @author x136858
 *
 */
public class Employee {

	private String empName;
	private String empSex;

	public Employee() {
		
		System.out.println("Initializing Employee object.");
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSex() {
		return empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

}
