package com.bbs.ControlStatement;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();

		if ((n % 2) == 0) {
			System.out.println("given number is even");
		} else {
			System.out.println(" given number is odd number");
		}
	}

}
