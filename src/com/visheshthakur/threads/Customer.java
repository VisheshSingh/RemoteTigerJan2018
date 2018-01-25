package com.visheshthakur.threads;

public class Customer {
	String name;
	int balance;

	public Customer() {
	}

	public Customer(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", balance=" + balance + "]";
	}

}
