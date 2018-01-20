package com.visheshthakur.accessSpecifiers;

// USE OF FINAL CLASS
final class Phone {
	// USE OF FINAL VARIABLE
	final int price = 90;

	void cost() {
		// price = 400; results in compilation error
	}

	// USE OF FINAL METHOD
	public final String screenSize() {
		return "5 inch";
	}

	public static void main(String args[]) {
		Phone moto = new Phone();
		moto.cost();
	}

}