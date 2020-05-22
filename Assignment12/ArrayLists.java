package JavaBasics;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {
			ArrayList<String> fruit = new ArrayList<String>();
			fruit.add("Mango");
			fruit.add("Apple");
			fruit.add("Banana");
			fruit.add("Guava");
			fruit.add("Pineapple");
			fruit.remove(0);
			fruit.remove(1);
			
			
			System.out.println("****Using Iterator Method****");
			
			Iterator lis = fruit.iterator();
			while(lis.hasNext()){
				System.out.println(lis.next());
			}
			System.out.println("****Using For each Method****");
			
			//Using For each Method
			for(String l :fruit ){
				System.out.println(l);
			}
	}

}
