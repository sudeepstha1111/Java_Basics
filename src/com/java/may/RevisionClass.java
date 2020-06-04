package com.java.may;

public class RevisionClass  extends Done implements Preparing  { // rc --> construnc, rc1-> 
	
	//BlankCheck= "    "; --> object 5--> 1000, 500, 20, 2000, 1 

	int age ;
	String name  ;
	
	
	public int getAge(){
		
		return  age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String Amit) {
		this.name = Amit;
	}
	public static void main(String[] args) {
		RevisionClass rc = new RevisionClass();
		RevisionClass rc2 = new RevisionClass();
		System.out.println(rc2.getName());
		rc.setName("Roshan");
		rc.setAge(25);
		System.out.println(rc.getName());
		System.out.println(rc.getAge());
		rc.printRevision();
		rc.overrideMethod();

	}

	@Override
	public void needMorePreparation() {
		// TODO Auto-generated method stub
		// when the ruquirement come we will wtore the logic 
		System.out.println("need works");
	}

	@Override
	public void testify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPin(String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int enterPin(String password, int acNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int enterPin(int pinNumber) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	public void overrideMethod(){
//		System.out.println("print ln");
//	}

}
