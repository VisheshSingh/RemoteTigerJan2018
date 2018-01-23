package com.visheshthakur.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.visheshthakur.BasicJava.Car;

public class ArrayListOfCars {

	private static void searchCarinList(List<Car> carList, int year) {
		for (Car car1 : carList) {
			if (year == car1.getYear())
				System.out.println("Record found in List :" + System.currentTimeMillis() + " milisecond");
			/*
			 * else System.out.println("Not Found");
			 */
		}
	}

	private static void searchCarinMap(Map<Integer, Car> carMap, int year) {
		for (Map.Entry<Integer, Car> me : carMap.entrySet()) {
			if (year == me.getKey())
				System.out.println("Record found in Map :" + System.currentTimeMillis() + " milisecond");
			/*
			 * else System.out.println("Not Found");
			 */
		}
	}

	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		Map<Integer, Car> carMap = new HashMap<Integer, Car>();
		int i;
		for (i = 0; i <= 1000000; i++) {
			Car c = new Car("Make" + i, "Model" + i, "Color" + i, 1000 + i, 1 + i);
			carMap.put(c.getYear(), c);
			carList.add(c);
		}
		System.out.println("Time before search:" + System.currentTimeMillis());
		new ArrayListOfCars().searchCarinMap(carMap, 2014);
		new ArrayListOfCars().searchCarinList(carList, 2014);

	}

}
