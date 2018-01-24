package com.visheshthakur.transaction;

public class ExecuteTransaction implements Runnable {
	Customer c1 = new Customer();
	int amt;

	public void setCustomer(Customer cus, int am) {
		this.c1.name = cus.name;
		this.c1.balance = cus.balance;
		amt = am;
	}

	// USIGN SYNCHRONIZE WILL LEAD TO ONE THREAD EXECUTING ONE AT A TIME
	// USING STATIC WILL HELP IN SHOWING SYNCHRONIZE
	public synchronized void processTransaction(Customer c, int amount) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.balance += amount;
		System.out.println(c.name + ", balance: " + c.balance);
	}

	// set customer updated everytime because of call in iterator;
	@Override
	public void run() {
		processTransaction(c1, amt);

	}
}
