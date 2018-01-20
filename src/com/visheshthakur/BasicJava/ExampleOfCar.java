package com.visheshthakur.BasicJava;

import java.util.Scanner;

public class ExampleOfCar {

	private int speed;// TODO: fuelLevel, MilesInGallons, NumOfMilesTravelled use them to calculate
						// relevant distance can be traveled

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelerate() {
		speed += 10;
	}

	public void brake() {
		speed -= 10;
	}

	public void park() {
		speed = 0;
	}

	// public void drive(int dist) {
	//
	// }

	public static void main(String[] args) {

		int newSpeed;
		ExampleOfCar myCar = new ExampleOfCar();
		// COMMAND LINE ARGS
		System.out.println("Make of your car: " + args[0] + " \nThe year of manufacturing " + args[1]);

		System.out.println("Enter the initial speed: ");

		Scanner sc = new Scanner(System.in);
		newSpeed = sc.nextInt();
		myCar.setSpeed(newSpeed);

		// RETURN MILEAGE
		// System.out.println("\nMileage of the car is: " + myCar.getMilesPerGallon() +
		// " MPG\n");
		// PUSH THE GAS FOR 5 SECONDS
		for (int i = 0; i < 5; i++) {
			if (myCar.getSpeed() > 0 && myCar.getSpeed() < 150) {
				myCar.accelerate();
				System.out.println("The speed of the car is " + myCar.getSpeed() + " MPH.");
			}
		}

		// PUSH THE BRAKE FOR 5 SECONDS
		System.out.println("\n Braking ... \n");
		for (int i = 0; i < 5; i++) {
			if (myCar.getSpeed() > 0 && myCar.getSpeed() < 150) {
				myCar.brake();
				System.out.println("The speed of the car is " + myCar.getSpeed() + " MPH.");
			}
		}

		// PARK THE CAR
		System.out.println("\nPARK MODE ACTIVATED: \n");
		myCar.park();
		System.out.println("Speed:" + myCar.getSpeed() + " MPH.");

	}

}