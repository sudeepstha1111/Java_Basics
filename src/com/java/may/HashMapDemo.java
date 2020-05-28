package com.java.may;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * 
		 * */
		
		ArrayList<String> list = new ArrayList<String>(); // list contaiins all the values 
		list.add("Dog");//m
		list.add("cat");//m
		list.add("Cow");//m
		list.add("Lion");//m
			// data type  variable to run for loop : list which holds values of the list 
		for(String m : list){  // for each loop,  m hold each values
			System.out.println("Animals Name: " + m);
		}
		
		
		System.out.println("*************************");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Amit"); // key and value 
		map.put(2, "Roshan");
		map.put(3, "Sajnee");
		map.put(4, "Banita");
		map.put(5, "Banita");

		System.out.println("HashMap Values");
		
		
		for(Map.Entry m : map.entrySet()){
			System.out.println("key: "+m.getKey() +"  values: "+ m.getValue());
		}
	}

}
