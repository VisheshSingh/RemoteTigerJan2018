package com.visheshthakur.automobile;

import com.visheshthakur.transport.Vehicle;

public class Suv extends Vehicle {
	String make, model;

	public Suv(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}

	// METHOD OVERLOADING
	public String getLeaseAmount(String montlyPayment) {
		return "2500.00 at signing and for $" + montlyPayment + ".00 as monthly installment";
	}

	// METHOD OVERRIDING
	public String interiors() {
		return "Vinyl";
	}

	public static void main(String[] args) {
		Suv lex = new Suv("Lexus", "RX 350");
		System.out.println(lex.make + " " + lex.model + " is available at $" + lex.getLeaseAmount("450"));
		System.out.println("Interiors: " + lex.interiors());
	}

}
