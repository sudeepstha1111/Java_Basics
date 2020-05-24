package com.java.may;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) { // LL is easy to manipulate but AL is harder 
		// In AL its easy to get elements but its hard in LL.
		
		LinkedList<Integer> age = new LinkedList<Integer>();
		age.add(20);
		age.add(30);
		age.add(40);
		age.add(50);
		age.remove(0);
		int b = age.get(3);
		age.remove(0);
		System.out.println(b);
		System.out.println(age);
		
		for(Integer a : age){
			System.out.println("My ages are:"+ a);
		}

		
		
	}

}
