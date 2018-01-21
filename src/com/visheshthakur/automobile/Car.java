package com.visheshthakur.automobile;

import com.visheshthakur.transport.Vehicle;

public class Car extends Vehicle {
	String make, model;

	public Car(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}

	public int getLeaseAmount() {
		return 3500;
	}

	// METHOD OVERRIDDING
	public String interiors() {
		System.out.println("Base model has: " + super.interiors());
		return "Leather";
	}

	public static void main(String[] args) {
		Car myCar = new Car("Acura", "mdx 2018");
		System.out.println(
				myCar.make + " " + myCar.model + " is available at $" + myCar.getLeaseAmount() + ".00 at signing");
		System.out.println("Interiors: " + myCar.interiors());

	}

}
