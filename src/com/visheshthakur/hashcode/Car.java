package com.visheshthakur.hashcode;

import java.util.HashMap;
import java.util.Map;

public class Car {
	String make, model;
	int carID;

	public Car(String make, String model, int carID) {
		super();
		this.carID = carID;
		this.make = make;
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int hashCode() {
		return (int) carID * 25;
	}

	public boolean equals(Object obj) {
		boolean flag = false;
		Car c = (Car) obj;
		if (c.carID == carID)
			flag = true;
		return flag;
	}

	public static void main(String[] args) {
		Car c1 = new Car("Honda", "Civic", 101);
		Car c2 = new Car("Honda", "Civic", 101);
		int originalHashCode1 = System.identityHashCode(c1);
		int originalHashCode2 = System.identityHashCode(c2);
		System.out.println("Original hashCode of Car 1---->>>" + originalHashCode1);
		System.out.println("Original hashCode of Car 2---->>>" + originalHashCode2);

		System.out.println("Overidden Car c1 hashcode: " + c1.hashCode());
		System.out.println("Overidden Car c2 hashcode: " + c2.hashCode());

		System.out.println(c1.equals(c2));

		Map<Integer, Car> map = new HashMap<Integer, Car>();
		map.put(101, c1);
		map.put(102, c2);

		if (map.get(101).hashCode() == map.get(102).hashCode()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}
