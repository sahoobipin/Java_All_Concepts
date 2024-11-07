package com.bbs.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream r = new FileInputStream("bbs.text");

			FileOutputStream w = new FileOutputStream("chandan.txt");

			int i = 0;
			while ((i = r.read()) != -1) {
				w.write((char) i);
			}
			System.out.println("data copied sucessfully");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
