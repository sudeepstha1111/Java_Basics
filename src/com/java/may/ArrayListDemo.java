package com.java.may;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<String>();
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
			for(String l :list ){
				System.out.println(l);
			}
	}

}
