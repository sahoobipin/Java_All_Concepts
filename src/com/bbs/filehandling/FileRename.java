package com.bbs.filehandling;

import java.io.File;

public class FileRename {
	public static void main(String[] args) {

		File f = new File("bpn.txt");
		File r = new File("chandan.txt");

		if (f.exists()) {
			System.out.println(f.renameTo(r));
		} else {
			System.out.println("file doesn't exists");
		}
	}
}
