package com.test.java;

import java.util.Scanner;

public class Facebook {
	
	String signUp  ;// signedup
	String firstName ; // facebook
	String lastName ; // company

  
// constructors	
	public Facebook() {
	}

	public Facebook(String fn, String lastName) {
		firstName = fn;
		this.lastName = lastName;
	}


	public Facebook(String signUp, String firstName, String lastName) {
		this.signUp = signUp;
		this.firstName = firstName;
		this.lastName = lastName;
	}


// setters and getters  also know as accessors and mutators
	
	public String showName(){
		return firstName;
	}

	public String getSignUp() {
		return signUp;
	}

	public void setSignUp(String signUp) {
		this.signUp = signUp;
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
	
	

	public static void main(String args[]){
		//instances/objects  //initializing a variable int a = 5;
		Facebook fb = new Facebook();
		
		fb.setFirstName("Facebook");
		fb.setLastName("Company");
		fb.setSignUp("SignedUp"); // String firstName = "facebook"
		
		System.out.println(fb.firstName); // fb is one instace/ one copy of your origical class/original transcript
		System.out.println(fb.lastName);
		System.out.println(fb.signUp);
		
		System.out.println("************getting values using getters ********");
		System.out.println(fb.getFirstName()); 
		System.out.println(fb.getLastName());
		System.out.println(fb.getSignUp());
		
		System.out.println("*******");
		System.out.println(fb.showName());
		System.out.println("************Another instance****");
		Facebook fb2 = new Facebook(); // objects are blueprint
		fb2.lastName = "Corporation";
		fb2.setLastName("Company");

		System.out.println(fb2.getLastName());
		
		System.out.println("************To String method****");
		System.out.println(fb.toString());
		System.out.println(fb2.toString());

		
	}

	@Override
	public String toString() {
		return "Facebook [signUp=" + signUp + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

