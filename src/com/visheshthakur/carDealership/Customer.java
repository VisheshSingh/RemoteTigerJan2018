package com.visheshthakur.carDealership;

public class Customer {
	int Customer_ID;
	String C_FirstName, C_LastName, C_PhoneNumber, City, State, Zipcode, AccountNumber, DriversLicenseNum;

	// PARAMETERIZED CONSTRUCTOR
	public Customer(int customer_ID, String c_FirstName, String c_LastName, String c_PhoneNumber, String city,
			String state, String zipcode, String accountNumber, String driversLicenseNum) {

		Customer_ID = customer_ID;
		C_FirstName = c_FirstName;
		C_LastName = c_LastName;
		C_PhoneNumber = c_PhoneNumber;
		City = city;
		State = state;
		Zipcode = zipcode;
		AccountNumber = accountNumber;
		DriversLicenseNum = driversLicenseNum;
	}

	public int getCustomer_ID() {
		return Customer_ID;
	}

	public String getC_FirstName() {
		return C_FirstName;
	}

	public String getC_LastName() {
		return C_LastName;
	}

	public String getC_PhoneNumber() {
		return C_PhoneNumber;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZipcode() {
		return Zipcode;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public String getDriversLicenseNum() {
		return DriversLicenseNum;
	}

}
