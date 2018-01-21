package com.visheshthakur.carDealership;

public class Model {
	String ModelNumber;
	int Make_ID, Miles_per_gallon;
	float Price, DownPayment, MonthlyPayment, MaintenanceCost;
	short YearOfProduction;

	public Model(String modelNumber, int make_ID, int miles_per_gallon, float price, float downPayment,
			float monthlyPayment, float maintenanceCost, short yearOfProduction) {
		ModelNumber = modelNumber;
		Make_ID = make_ID;
		Miles_per_gallon = miles_per_gallon;
		Price = price;
		DownPayment = downPayment;
		MonthlyPayment = monthlyPayment;
		MaintenanceCost = maintenanceCost;
		YearOfProduction = yearOfProduction;
	}

	public boolean addModel(String modelNumber, int make_ID, int miles_per_gallon, float price, float downPayment,
			float monthlyPayment, float maintenanceCost, short yearOfProduction) {
		ModelNumber = modelNumber;
		Make_ID = make_ID;
		Miles_per_gallon = miles_per_gallon;
		Price = price;
		DownPayment = downPayment;
		MonthlyPayment = monthlyPayment;
		MaintenanceCost = maintenanceCost;
		YearOfProduction = yearOfProduction;
		return true;
	}

	public String getModelNumber() {
		return ModelNumber;
	}

	public int getMake_ID() {
		return Make_ID;
	}

	public int getMiles_per_gallon() {
		return Miles_per_gallon;
	}

	public float getPrice() {
		return Price;
	}

	public float getDownPayment() {
		return DownPayment;
	}

	public float getMonthlyPayment() {
		return MonthlyPayment;
	}

	public float getMaintenanceCost() {
		return MaintenanceCost;
	}

	public short getYearOfProduction() {
		return YearOfProduction;
	}

}
