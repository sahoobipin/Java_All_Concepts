package com.bbs.filehandling;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("enter any number or integer");
		int i = scn.nextInt();
		System.err.println("int= " + i);

		System.out.println("enter any string");
		String s = scn.next();
		System.err.println("String= " + s);

		System.out.println("enter any character");
		char ch = scn.next().charAt(i);
		System.err.println("int= " + i);

		System.out.println("enter any  double ");
		double d = scn.nextDouble();
		System.err.println("double= " + d);

		scn.close(); 

	}

}
