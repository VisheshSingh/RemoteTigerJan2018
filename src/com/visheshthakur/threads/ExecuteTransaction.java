package com.visheshthakur.threads;

import java.util.concurrent.Callable;

//implements Runnable
public class ExecuteTransaction implements Callable<Customer> {
	Customer c1;
	int amt;

	public void setCustomer(Customer cus, int am) {
		this.c1 = cus;
		this.amt = am;
	}

	public void processTransaction(Customer c, int amount) throws Exception {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (c.name.equals("Customer5")) {
			try {
				throw new Exception("**Payment unsuccessful**");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		c.balance += amount;
		System.out.println(c.name + ", balance: " + c.balance);
	}

	@Override
	public Customer call() throws Exception {
		try {
			processTransaction(this.c1, amt);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return this.c1;
	}

}
