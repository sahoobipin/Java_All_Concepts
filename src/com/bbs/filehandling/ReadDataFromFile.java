package com.bbs.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFile {
	public static void main(String[] args) {
		File f = new File("chandan.txt");
		try {
			Scanner scn = new Scanner(f);
			while (scn.hasNextLine()) {
				String line = scn.nextLine();
				System.out.println(line);
			}
			scn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
