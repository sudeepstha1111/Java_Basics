package com.java.may;

public class MainProgram {
	
	public static void main(String [] args){
		
		Office office = new Office(new Department("Accounting", "Finance", "IT", "HR"));
		Department department = office.getDepartment();
		System.out.println(department.accouting);
		System.out.println(department.finance);
		System.out.println(department.humanResources);
		System.out.println(department.informationTechnology);
		System.out.println(office.toString());
		System.out.println("*****************************");
		
		Employee emp = new Employee();
		emp.setFirstName("Henry");
		emp.setLastName("Ford");
		emp.setAddress("USA");
		emp.setId(1);
		System.out.println(emp.getId());
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getAddress());
		System.out.println(emp.getDesignation());
		
		emp.employeeDesignmation();
		System.out.println("*****************************");
		
		OfficeSupplies supplies1 = new OfficeSupplies("MAC BOOK","iMAC", "Pencil", "Chair");
		System.out.println(supplies1.toString());
		supplies1.getOfficeSupplies(supplies1.getComputer());
		OfficeSupplies supplies2 = new OfficeSupplies();
		supplies2.setMonitors("Dell Monitors");
		supplies2.getOfficeSupplies(supplies2.getMonitors());
		
		System.out.println("*****************************");
		
		Office office2 = new Office();
		office2.setDepartment(department);
		office2.setEmployee(emp);
		office2.setOfficeSupplie(supplies1);
		System.out.println(office2.toString());

		
	}


}
