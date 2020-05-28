package com.java.may;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	SUNDAY, MONDAY, TUESDAY , WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
enum states {
	
	 TX, VA, CA, NY
}
public class EnumDemo {

//	enum days{
//		
//		SUNDAY,MONDAY, TUESDAY , WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<days> set = EnumSet.of(days.FRIDAY, days.TUESDAY);
		
		Iterator<days> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
