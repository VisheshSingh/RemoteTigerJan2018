package com.visheshthakur.BasicJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDate {

	public static void main(String[] args) {
		String string = "Hello man, 01.17.2018 how are 01.12.2018 you doing? ";
		Pattern p = Pattern.compile("\\d\\d[-|/|.]\\d\\d[-|/|.]\\d\\d\\d\\d");
		Matcher m = p.matcher(string);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

}