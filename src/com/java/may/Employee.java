package com.java.may;

public class Employee {

	String firstName;
	String lastName;
	static String designation = "CEO";
	int id;
	String address;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String designation, int id, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.id = id;
		this.address = address;
	}
	
	public static void employeeDesignmation(){
		
		System.out.println("Employee Designation is : " + designation);
		
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", designation=" + designation + ", id="
				+ id + ", address=" + address + "]";
	}

}
