package com.visheshthakur.BasicJava;

//import java.util.Scanner;

public class AddNumStrings {
	public static int StringToInteger(String str) {
		int result = 0, factor = 1;
		for (int i = str.length() - 1; i >= 0; i--) {
			// str.charAt(i) will return the ASCII value of 4 in this case first
			// So 4 is 52 and 0 is 48 => 52-48 = 4
			result += (str.charAt(i) - '0') * factor; // TODO: ASCII VALUE CONVERSION, This is going to work for
														// numbers as a string
			// System.out.println(result);
			factor *= 10;
		}
		return result;// This is going to return integer but
						// try getting the output as a string
	}

	public static void main(String[] args) {
		System.out.print("Result:");
		System.out.println(StringToInteger("1234") + StringToInteger("456"));

	}

}
