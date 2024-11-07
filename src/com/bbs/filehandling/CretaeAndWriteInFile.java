package com.bbs.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CretaeAndWriteInFile {

	public static void main(String[] args) {
		File myfile = new File("bbs.txt");
		try {
			FileWriter fileWriter = new FileWriter(myfile);

			fileWriter.write("Someone is working Harder than you");

			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		System.out.println("done");
	}
}
