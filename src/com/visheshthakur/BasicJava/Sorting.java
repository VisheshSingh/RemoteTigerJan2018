package com.visheshthakur.BasicJava;

public class Sorting {

	public static void main(String[] args) {
		int arr[] = { 100, 25, 15, 45, 150, 10, 65 };
		System.out.println("Before sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sortArray(arr);
		System.out.println();
		System.out.println("After sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sortArray(int arr[]) {
		// for sorted portion of array
		for (int i = 1; i < arr.length; i++) {
			int j = i; // index for unsorted portion of the array
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j = j - 1;// move left through sorted portion
			}
		}
	}

}
