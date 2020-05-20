package com.java.may;

public class Office {

//	HeadQuarters headquarters;
	Department department;
	Employee employee;
	OfficeSupplies officeSupplie;

	public Office() {  
	}

	public Office(Department department) {
		this.department = department;
	}

	public Office(Department department, Employee employee, OfficeSupplies officeSupplie) {
		this.department = department;
		this.employee = employee;
		this.officeSupplie = officeSupplie;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public OfficeSupplies getOfficeSupplie() {
		return officeSupplie;
	}

	public void setOfficeSupplie(OfficeSupplies officeSupplie) {
		this.officeSupplie = officeSupplie;
	}

	@Override
	public String toString() {
		return "Office [department=" + department + ", employee=" + employee + ", officeSupplie=" + officeSupplie + "]";
	}

	
}
