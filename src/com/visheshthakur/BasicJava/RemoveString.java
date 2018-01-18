package com.visheshthakur.BasicJava;

import java.util.Arrays;

public class RemoveString {
	public static String[] remString(String arr[], int index) {
		String[] newArr = new String[arr.length - 1];
		if (index < 0 || index > arr.length) {
			return arr;
		}
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == index) {
				i++;
			}
			newArr[j++] = arr[i];
		}

		return newArr;
	}

	public static void main(String[] args) {
		String arr[] = { "hello", "world", "hi", "people" };
		int index = 1;
		String[] newArray = remString(arr, index);
		System.out.println(Arrays.toString(newArray));

	}

}
