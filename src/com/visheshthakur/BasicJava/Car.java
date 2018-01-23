package com.visheshthakur.BasicJava;

import java.util.Arrays;
import java.util.Scanner;

public class Car implements Comparable<Car> {
	String make, model, color;
	int year, price;

	public Car(String make, String model, String color, int year, int price) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public int getPrice() {
		return price;
	}

	public void interiors() {
		System.out.println("Has got leather interiors");
	}

	public static void Search(String[] arr, String targetValue) {
		for (String s : arr) {
			if (s.equals(targetValue))
				System.out.println();
		}
	}

	@Override
	public int compareTo(Car myCar) {
		if (price == myCar.price)
			return 0;
		else if (price < myCar.price)
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		Car[] ArrayofCars = new Car[10];
		Car Audi1 = new Car("Audi", "A6", "Red", 2016, 45600);
		Car Audi2 = new Car("Audi", "Q5", "Royal Blue", 2016, 42500);
		Car BMW1 = new Car("BMW", "x3", "Gray", 2013, 40195);
		Car BMW2 = new Car("BMW", "x5", "Alpha Red", 2016, 55700);
		Car Chevy1 = new Car("Chevrolet", "Cruze", "White", 2017, 16875);
		Car Chevy2 = new Car("Chevrolet", "Equinox", "White", 2015, 21300);
		Car Honda1 = new Car("Honda", "Accord", "Blue", 2012, 11675);
		Car Honda2 = new Car("Honda", "Civic", "Maroon", 2014, 13000);
		Car Kia1 = new Car("kia", "Optima", "Black", 2015, 21500);
		Car Kia2 = new Car("kia", "Sorento", "Pale Green", 2014, 23850);

		ArrayofCars[0] = Audi1;
		ArrayofCars[1] = BMW1;
		ArrayofCars[2] = Chevy1;
		ArrayofCars[3] = Honda1;
		ArrayofCars[4] = Kia1;
		ArrayofCars[5] = Audi2;
		ArrayofCars[6] = BMW2;
		ArrayofCars[7] = Chevy2;
		ArrayofCars[8] = Honda2;
		ArrayofCars[9] = Kia2;

		System.out.println("List of cars based on Car prices from highest to least:");
		Arrays.sort(ArrayofCars);
		for (Car c : ArrayofCars) {
			System.out.println(c.getMake() + " " + c.getModel() + " " + c.getPrice());
		}

		System.out.println("What brand would you prefer?");
		Scanner sc = new Scanner(System.in);
		String brand = sc.nextLine();
		System.out.println("We have two models: Which one would you like?");
		String model = sc.nextLine();
		System.out.println("What year?");
		int year = sc.nextInt();
		for (int i = 0; i < ArrayofCars.length; i++) {
			if (brand.equals(ArrayofCars[i].make)) {
				if (model.equals(ArrayofCars[i].model)) {
					if (year == ArrayofCars[i].year) {
						System.out.println("The price of selected model is: " + ArrayofCars[i].getPrice());
					}
				}
				break;
			}
		}

	}

}
