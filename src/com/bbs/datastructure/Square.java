package com.bbs.datastructure;

import java.util.Scanner;

public class Square {
	static int square(int n) {
		return (n * n);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int value = square(n);
		System.out.println(value);
		System.out.println("Size of int in Java is: " + Integer.BYTES + " bytes");
	}

}
