package com.visheshthakur.BasicJava;

import java.util.Scanner;

public class InsertEle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size:");
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Your new element:");
		int newEle = sc.nextInt();
		System.out.print("Position:");
		int position = sc.nextInt();

		for (int i = (newEle); i >= (position - 1); i--) {
			a[i + 1] = a[i];
		}
		a[position] = newEle;
		System.out.print("After inserting:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n]);
	}

}