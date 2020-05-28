package com.java.may;

import java.util.Comparator;

public class CarNoComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Car c1 = (Car) o1;
		Car c2 = (Car) o2;
		// positive , 0 , negative 
		if(c1.carNo == c2.carNo){
			return 0;
		} else if(c1.carNo > c2.carNo){
			return 1;
		} else {
			return -1;
		}
		
		
	}

}
