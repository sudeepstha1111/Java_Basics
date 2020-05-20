package com.java.may;

public class ITTeacher extends Teacher  {

	int additionalSalary = 50000;
	//String collegeName = "MIT" ;
	//String sub = "Java";
	
	public void print(int salary){
		System.out.println(super.salary + salary);  // parent class of all class , which is called object class
		
	}
	
	public void printDesignation(){
		System.out.println(" I am child class Teacher");
	}
	
	public void print(String age){
		System.out.println("My age is "+ age);
	}
	
	public void print(String age,int salary ){
		System.out.println("My age is "+ age);
	} 
	public static void main(String[] args) {
		
		ITTeacher it = new ITTeacher();
		int additionalsalary = it.salary;
		it.print(additionalsalary);
		it.print("45");
		it.printDesignation();
		
		System.out.println(it.collegeName);

		
		
	}

}


