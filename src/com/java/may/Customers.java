package com.java.may;

public class Customers extends  BankOfAmericaATM {

	public void MyPlayList(){
		
	}
	@Override
	public void deposit(int money) {
		System.out.println("you money is deposited"+ money);
		
	}

	@Override
	public void withdraw() {
		System.out.println("you withdraw you money");
		
	}

	@Override
	public void checkBalances() {
		// TODO Auto-generated method stub
		System.out.println("your balance is some balance");
	}
	
	
	public static void main(String[] args) {
		Customers Roshan = new Customers();
		BankOfAmericaATM roshan1 = new Customers();
		System.out.println("welcome to Bank of America");
		Roshan.MyPlayList();
		
		
		
		
		
		
	}

}
