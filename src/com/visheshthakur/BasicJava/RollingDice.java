package com.visheshthakur.BasicJava;

import java.util.Random;

public class RollingDice {
	int dice[] = { 1, 2, 3, 4, 5, 6 };
	Random myRand = new Random();// TODO: Possible solution could be Math.random: 0.0 to 1.0 * 6.0

	public int getDiceFace() {
		int index = myRand.nextInt(dice.length);// TODO:
		int result = dice[index];
		return result;
	}

	public static void main(String[] args) {
		RollingDice rd = new RollingDice();
		System.out.println("Using Random class - You rolled: " + rd.getDiceFace());
		int result = (int) (Math.random() * 6) + 1;
		System.out.println("Using Math.random() - you rolled " + result);
	}

}
