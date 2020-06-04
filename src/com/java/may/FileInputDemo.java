package com.java.may;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args)  {
		try{
		FileInputStream fin = new FileInputStream("test.txt");
		int i = 0;
		String sample = "" ;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
			
			sample = sample+ (char)i;
		}
		System.out.println();
		System.out.println(sample);
		String lastName = "Kc";
		System.out.println(sample+ " "+lastName);
		fin.close();
		} catch(IOException e){
			System.out.println("No file found ");
			e.printStackTrace();
		}
		
		System.out.println("Rest of the Program.....");
	}

}
