package com.visheshthakur.BasicJava;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 90, 85, 80, 92 };
		System.out.println("The second highest element is: " + secHigh(arr));
	}

	public static int secHigh(int[] arr) {
		int highest = Integer.MIN_VALUE;// -2^31 - Might use Min_Value
		int secHighest = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) { // Reverse The condition for getting the second least
				secHighest = highest;// System.out.println(secHighest);
				highest = arr[i];// System.out.println(highest);
			} else if (arr[i] > secHighest) {
				secHighest = arr[i];
			}
		}
		return secHighest;
	}

}
