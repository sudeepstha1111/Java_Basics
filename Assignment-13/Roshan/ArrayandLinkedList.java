package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayandLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> fruit = new ArrayList<Integer>();
		fruit.add(11);
		fruit.add(12);
		fruit.add(13);
		fruit.add(14);
		fruit.add(15);
		
		System.out.println("****Using ArrayList Iterator Method****");
		
		Iterator<Integer> lis = fruit.iterator();
		while(lis.hasNext()){
			System.out.println(lis.next());
		}
		System.out.println("****Using ArrayList For each Method****");
		
		//Using For each Method
		for(Integer l :fruit ){
			System.out.println(l);
		}
		
		 System.out.println("****Using ArrayList For Loop Method****");
	      for (int counter = 0; counter < fruit.size(); counter++) { 		      
	          System.out.println(fruit.get(counter)); 		
	      } 
		
	}
}
