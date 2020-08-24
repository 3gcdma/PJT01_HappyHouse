package com.ssafy.happyhouse.model.dto;

public class PannelInfo {
	private String name;
	private String selection;
	private String address;
	private int Lati;
	private int Hard;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSelection() {
		return selection;
	}
	public void setSelection(String selection) {
		this.selection = selection;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLati() {
		return Lati;
	}
	public void setLati(int lati) {
		Lati = lati;
	}
	public int getHard() {
		return Hard;
	}
	public void setHard(int hard) {
		Hard = hard;
	}
	public PannelInfo(String name, String selection, String address, int lati, int hard) {
		super();
		this.name = name;
		this.selection = selection;
		this.address = address;
		Lati = lati;
		Hard = hard;
	}
	public PannelInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "PannelInfo [name=" + name + ", selection=" + selection + ", address=" + address + ", Lati=" + Lati
				+ ", Hard=" + Hard + "]";
	}
	
	
}
