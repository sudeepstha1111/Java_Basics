package com.java.may;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingDemo {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(10);
		list.add(25);
		list.add(30);
		list.add(5);
		
		Collections.sort(list);
		Collections.reverse(list);

		for(Integer age : list){
			System.out.println(age);
		}
		
		System.out.println("______________________________");
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Bananas");
		fruits.add("Apple");
		fruits.add("WaterMelon");
		fruits.add("Mango");
		Collections.sort(fruits);
		for(String fruit : fruits){
		System.out.println(fruit);
		}
		
		
		System.out.println("______________________________");
		
		ArrayList<Fruits> al = new ArrayList<Fruits>();
		 al.add(new Fruits(100));
		 al.add(new Fruits(50));
		 al.add(new Fruits(20));
		 al.add(new Fruits(200));

		 Collections.sort(al);
		 
		 for(Fruits f: al){
		 System.out.println(f.getPrice());
		 }
		
		System.out.println("______________________________");
			
		ArrayList<Car> clist = new ArrayList<Car>();
		 
		 clist.add(new Car(3, "FORD", "Black"));
		 clist.add(new Car(1, "BMW", "Red"));
		 clist.add(new Car(2, "Mercedez", "White"));
		 clist.add(new Car(4, "Toyota", "Blue"));
		 Collections.sort(clist, new CarNameComp());
		 Collections.sort(clist, new CarNoComp());

		 for(Car c : clist){
			 System.out.println(c.carNo +" "+ c.carName + " " +c.carColor);
		 }

		 
	}

}
