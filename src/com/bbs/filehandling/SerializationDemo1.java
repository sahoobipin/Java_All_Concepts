package com.bbs.filehandling;

import java.io.FileInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo1 {
	public static void main(String[] args) {
		try {
			Employee emp = new Employee(1, 24, "bipin");
			FileInputStream fout = new FileInputStream("bbs.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(emp);
			out.flush();
			out.close();
			System.out.println("serialization Sucessfully donoe");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
