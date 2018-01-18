package com.visheshthakur.BasicJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {

	public static void main(String[] args) {
		String s = "Check for a valid email in this sentence example123@gmail.com also check if there is one more TimCook_ceo@apple.com ";
		Pattern p = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

}