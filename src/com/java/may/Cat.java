package com.java.may;

public class Cat extends Animal {
	
	
	private String firstName;
	private String Ac;

	public void test(){
		System.out.println("Test cat");
	}
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		animal1.sound();
		animal1.favFood();
	}

	@Override
	public void sound() {
		System.out.println("Meow");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		
	}
	
	

}
