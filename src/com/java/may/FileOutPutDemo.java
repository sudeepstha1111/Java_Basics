package com.java.may;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutDemo {

	public static void main(String args[]){
		
		try{
		FileOutputStream fout = new FileOutputStream("test.txt");
		String test = "This is file demo";
		byte b[] = test.getBytes();
		fout.write(b);
		//fout.write(65);
		fout.close();
		System.out.println("Successfully write to a file");
		}catch(IOException e){
			System.out.println("Unsuccesful");
			e.printStackTrace();
		}

		  
	}
		
		
}
