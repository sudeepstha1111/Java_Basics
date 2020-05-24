package com.java.may;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("Texas");
		set.add("NewYork");
		set.add("NewYork");
		set.add("Virginia");
		set.add("Virginia");
		set.add("North Carolina");
		set.add("North Carolina");

		set.add("Delaware");

			Iterator itr = set.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			System.out.println("*********");
			for(String a: set){
			System.out.println(a);
			}
	}

}
