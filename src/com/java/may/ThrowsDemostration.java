package com.java.may;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsDemostration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ExceptionDemo ed = new ExceptionDemo();
		int x = 1;
		do {
		try {
			
			System.out.println("enter first number");
			int num1 = input.nextInt();
			System.out.println("enter second number");
			int num2 = input.nextInt();
			System.out.println("Divide numbers");
			int result = num1/num2;
			System.out.println("Result :" + result);
			x=2;
		} catch (Exception e) {
			System.out.println("Cannot divide by zero");
		}
		} while(x==1);
		
		
		System.out.println("Rest of the program");
		
		
	}

}
