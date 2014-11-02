package com.money;

public class MoneyMain {

	public static void main(String[] args) {
		Money m=new Money();
		m.setAmount(1000);
		System.out.println("Current amount: Rs. "+m.getAmount());

	}

}
