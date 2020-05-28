package com.java.may;

public class Fruits implements Comparable<Fruits> {

	private int price;

	public Fruits(int fruit) {
		this.price = fruit;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruits [fruit=" + price + "]";
	}

	@Override
	public int compareTo(Fruits o) {
		// positive , 0 , negative 
		if(price == o.price)
			return 0;
		else if(price < o.price)
			return 1;
		else 
		return -1;
	}
	
	

}
