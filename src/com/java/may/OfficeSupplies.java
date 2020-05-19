package com.java.may;

public class OfficeSupplies {

	String computer;
	String monitors;
	String stationery;
	String furniture;

	public OfficeSupplies() {
		super();
	}

	public OfficeSupplies(String computer, String monitors, String stationery, String furniture) {
		super();
		this.computer = computer;
		this.monitors = monitors;
		this.stationery = stationery;
		this.furniture = furniture;
	}

	public void getOfficeSupplies(String supplies){
		System.out.println("Your requested item  is ready :" + supplies);
	}
	
	public String getComputer() {
		return computer;
	}

	public void setComputer(String computer) {
		this.computer = computer;
	}

	public String getMonitors() {
		return monitors;
	}

	public void setMonitors(String monitors) {
		this.monitors = monitors;
	}

	public String getStationery() {
		return stationery;
	}

	public void setStationery(String stationery) {
		this.stationery = stationery;
	}

	public String getFurniture() {
		return furniture;
	}

	public void setFurniture(String furniture) {
		this.furniture = furniture;
	}

	@Override
	public String toString() {
		return "OfficeSupplies [computer=" + computer + ", monitors=" + monitors + ", stationery=" + stationery
				+ ", furniture=" + furniture + "]";
	}

}
