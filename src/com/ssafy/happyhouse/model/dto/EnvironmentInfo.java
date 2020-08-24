package com.ssafy.happyhouse.model.dto;

public class EnvironmentInfo {
	private String name;
	private String type;
	private String checkAgency;
	private String address;
	
	public EnvironmentInfo() {
		super();
	}

	public EnvironmentInfo(String name, String type, String checkAgency, String address) {
		super();
		this.name = name;
		this.type = type;
		this.checkAgency = checkAgency;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCheckAgency() {
		return checkAgency;
	}

	public void setCheckAgency(String checkAgency) {
		this.checkAgency = checkAgency;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EnvironmentMap [name=" + name + ", type=" + type + ", checkAgency=" + checkAgency + ", address="
				+ address + "]";
	}
	
	
	
}
