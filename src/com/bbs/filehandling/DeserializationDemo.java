package com.bbs.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;

public class DeserializationDemo {
	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("bbs.txt");

			ObjectOutputStream in = new ObjectOutputStream(fin);
			Employee emp1=(Employee)in.readO
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
