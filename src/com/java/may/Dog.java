package com.java.may;

public class Dog extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Barks---");
	}

	public static void main(String[] args) {
		
		Animal obj   = new Dog();  // upcasting 
		obj.sound();
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		
	}

}
