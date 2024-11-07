package com.bbs.filehandling;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File f = new File("bbs.txt");

		if (f.delete()) {
			System.out.println("file deleted sucessfully " + f.getName());
		} else {
			System.out.println("some problem occured");
		}
	}

}
