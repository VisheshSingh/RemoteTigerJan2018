package com.visheshthakur.carDealership;

public class Dealer {
	int Dealer_ID;
	String D_FirstName, D_LastName, D_PhoneNumber, D_Location;

	// PARAMETERIZED CONSTRUCTOR
	public Dealer(int dealer_ID, String d_FirstName, String d_LastName, String d_PhoneNumber, String d_Location) {

		Dealer_ID = dealer_ID;
		D_FirstName = d_FirstName;
		D_LastName = d_LastName;
		D_PhoneNumber = d_PhoneNumber;
		D_Location = d_Location;
	}

	public int getDealer_ID() {
		return Dealer_ID;
	}

	public String getD_FirstName() {
		return D_FirstName;
	}

	public String getD_LastName() {
		return D_LastName;
	}

	public String getD_PhoneNumber() {
		return D_PhoneNumber;
	}

	public String getD_Location() {
		return D_Location;
	}

}
