package com.visheshthakur.BasicJava;

public class SecondLeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 90, 85, 80, 92 };
		System.out.println("The second least element is: " + secLeast(arr));
	}

	public static int secLeast(int[] arr) {
		int least = Integer.MAX_VALUE;// -2^31 - Might use Min_Value
		int secLeast = Integer.MAX_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < least) { // Reverse The condition for getting the second least
				secLeast = least;// System.out.println(secHighest);
				least = arr[i];// System.out.println(highest);
			} else if (arr[i] < secLeast) {
				secLeast = arr[i];
			}
		}
		return secLeast;
	}

}
