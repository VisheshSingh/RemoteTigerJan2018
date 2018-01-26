package com.visheshthakur.InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Vishesh\\ReadData.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
