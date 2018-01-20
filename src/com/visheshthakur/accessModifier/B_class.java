package com.visheshthakur.accessModifier;

import com.visheshthakur.accessSpecifiers.A_class;

public class B_class extends A_class {
	// USAGE OF STATIC BLOCK
	static {
		System.out.println("This is the first static block");
	}
	// USE OF STATIC VARIABLE
	static String workPlace = "Remote Tiger";

	void getWorkPlace() {
		System.out.println("Name of the Company: " + workPlace);
	}

	static {
		System.out.println("This is the second static block");
	}

	public static void main(String[] args) {

		// ACCESS SPECIFIER - DEFAULT
		A_class myObj = new A_class();
		// myObj.printHi(); // compilation error

		// ACCESS SPECIFIER - PROTECTED
		B_class b = new B_class(); // TODO:RELEVANT NAMES
		System.out.println("University ID#: " + b.U_id());

		// ACCESS SPECIFIER - PUBLIC
		System.out.println("Weight: " + b.weight());

		b.getWorkPlace();// NO NEED TO USE AN OBJECT
	}
}
