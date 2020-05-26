package JavaBasics;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {

		LinkedList<String> city = new LinkedList<String>();
		city.add("New York");
		city.add("California");
		city.add("Texas");
		city.add("New Jersey");
		city.add("Las Vegas");
		
		System.out.println("****Using LinkedList Iterator Method****");
		
		Iterator<String> listt = city.iterator();
		while(listt.hasNext()){
			System.out.println(listt.next());
		}
		System.out.println("****Using LinkedList For each Method****");
		
		//Using For each Method
		for(String l :city ){
			System.out.println(l);
		}
		
		 System.out.println("****Using LinkedList For Loop Method****");
	      for (int counter = 0; counter < city.size(); counter++) { 		      
	          System.out.println(city.get(counter)); 		
	      } 

	}

}

