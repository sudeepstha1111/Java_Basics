package com.java.may;

public class Department {

	String accouting;
	String finance;
	String informationTechnology;
	String humanResources;

	public Department() {

	}

	public Department(String accouting, String finance, String informationTechnology, String humanResources) {
		super();
		this.accouting = accouting;
		this.finance = finance;
		this.informationTechnology = informationTechnology;
		this.humanResources = humanResources;
	}

	public String getAccouting() {
		return accouting;
	}

	public void setAccouting(String accouting) {
		this.accouting = accouting;
	}

	public String getFinance() {
		return finance;
	}

	public void setFinance(String finance) {
		this.finance = finance;
	}

	public String getInformationTechnology() {
		return informationTechnology;
	}

	public void setInformationTechnology(String informationTechnology) {
		this.informationTechnology = informationTechnology;
	}

	public String getHumanResources() {
		return humanResources;
	}

	public void setHumanResources(String humanResources) {
		this.humanResources = humanResources;
	}

	@Override
	public String toString() {
		return "Department [accouting=" + accouting + ", finance=" + finance + ", informationTechnology="
				+ informationTechnology + ", humanResources=" + humanResources + "]";
	}

}
