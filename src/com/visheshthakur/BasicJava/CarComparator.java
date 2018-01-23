package com.visheshthakur.BasicJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarComparator {

	// public int compare(Car c1, Car c2) {
	// Car myCar = (Car) c1;
	// Car myCar2 = (Car) c2;
	//
	// return (myCar.color.compareTo(myCar2.color));
	//
	// }

	public static void main(String[] args) {
		Car[] ArrayofCars = new Car[5];
		Car Audi1 = new Car("Audi", "A6", "Red", 2016, 45600);
		Car BMW1 = new Car("BMW", "x3", "Gray", 2013, 40195);
		Car Chevy1 = new Car("Chevrolet", "Cruze", "White", 2017, 16875);
		Car Honda1 = new Car("Honda", "Accord", "Blue", 2012, 11675);
		Car Kia1 = new Car("kia", "Optima", "Black", 2015, 21500);

		ArrayofCars[0] = Audi1;
		ArrayofCars[1] = BMW1;
		ArrayofCars[2] = Chevy1;
		ArrayofCars[3] = Honda1;
		ArrayofCars[4] = Kia1;

		List<Car> cars = new ArrayList<Car>();
		cars.add(Audi1);
		cars.add(BMW1);
		cars.add(Chevy1);
		cars.add(Honda1);
		cars.add(Kia1);

		System.out.println("List of car color in ascending order:");
		Collections.sort(cars);
		for (Car c : cars) {
			System.out.println(c.getMake() + " " + c.getColor() + " " + c.getPrice());
		}
	}

}
