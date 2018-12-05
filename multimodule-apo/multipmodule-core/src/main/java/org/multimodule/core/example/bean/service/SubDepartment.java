package org.multimodule.core.example.bean.service;

public class SubDepartment {

	private String subDepName;
	private String subDepAddress;

	public SubDepartment() {
		System.out.println("Initializing subdepartment.");
	}

	public String getSubDepName() {
		return subDepName;
	}

	public void setSubDepName(String subDepName) {
		this.subDepName = subDepName;
	}

	public String getSubDepAddress() {
		return subDepAddress;
	}

	public void setSubDepAddress(String subDepAddress) {
		this.subDepAddress = subDepAddress;
	}

}
