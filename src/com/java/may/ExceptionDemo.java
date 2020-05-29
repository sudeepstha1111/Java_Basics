package com.java.may;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		// javac , eclipse is already running a compiler behind the scene
		
		try {
			FileReader fr = new FileReader("db.proper");
		} catch (FileNotFoundException e) {
			System.out.println("This file is not available ");
		}  // checked 
		System.out.println("***********************Rest fo the program");
		method1();
	}
	
	public static void method1(){
		System.out.println();
		System.out.println("method1");
		method2();
	}
	public static void method2(){
		System.out.println("method2");
		method3();
	}
	public static void method3(){
		System.out.println("method3");
		int a = 10;
		try {
		int div = 10/0;
		} catch(Exception e){
			System.out.println("Cannot divide by zero" );
			e.printStackTrace();
		} finally {
			System.out.println("You are logged out of you Banking session for security reasons");
		}
	}	
	
	public void readFile() throws FileNotFoundException{
		FileReader fr = new FileReader("db.proper");
		// propogating this exception to other developer 
	}
	
	
	

}
