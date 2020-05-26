import java.util.Collections;
    import java.util.Iterator;
	import java.util.LinkedList;

	public class ReverseArrayList {

		public static void main(String[] args) {

			LinkedList<String> city = new LinkedList<String>();
			city.add("New York");
			city.add("California");
			city.add("Texas");
			city.add("New Jersey");
			city.add("Las Vegas");
			
			Collections.reverse(city);
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

		}

	}

