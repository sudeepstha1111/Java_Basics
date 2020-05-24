package com.java.may;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<String>();
			ArrayList<Integer> r = new ArrayList<Integer>();
			r.add(100);
			r.add(200);
			r.add(300);
			r.add(400);
			
			list.add("Ningma"); //0
			list.add("Roshan");//1
			list.add("Keshab");
			list.add("Banita");
			list.add("Ningma");
			//list.remove(0);
			
			Iterator itr = list.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			System.out.println("**************");
			
			/// foreach
			for(Integer l :r ){
				System.out.println("RollNumbers are :" + l);
			}
	}

}
