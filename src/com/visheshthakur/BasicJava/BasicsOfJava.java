package com.visheshthakur.BasicJava;

import java.util.Scanner;

public class BasicsOfJava {

	// SWITCH CASE and USE of STATIC METHOD
	public static String TestSwitch() {
		System.out.println("What phone would you like to buy in 2018? - iPhone, Google Pixel 2, oneplus 5T ");
		Scanner sc = new Scanner(System.in);
		String phone = sc.nextLine();
		switch (phone) {
		case "iPhone":
			return "May the force be with you! Good luck :(";
		case "Google Pixel 2":
			return "Awesome, you will really enjoy the camera on this one!";
		case "oneplus 5T":
			return "Great choice, 'It's the best FLAGSHIP at budget'";
		default:
			return "you are the from another planet buddy...";
		}
	}

	// ACCESS MODIFIERS - PRIVATE
	private int SSN;

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TestSwitch());
		BasicsOfJava ssn = new BasicsOfJava();
		ssn.setSSN(123456789);
		System.out.println("Thanks for sharing your SSN:" + ssn.getSSN());
	}

}
