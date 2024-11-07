package com.bbs.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("j/chnadan.txt");
			try {
				f.write("java pgm is the best language");
			    } 
			finally {
				f.close();
			        }
			System.out.println("sucessfully data wrote in the file");
		  } catch (IOException e) {
			System.out.println(e);
		}
	}
}
