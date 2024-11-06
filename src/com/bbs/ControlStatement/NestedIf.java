package com.bbs.ControlStatement;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		if (n < 100) {
			System.out.println("given number is bellow hundred");
			if (n % 2 == 0)
				System.out.println("number is even nhumber");
			else
				System.out.println("number is odd");
		} else {
			System.out.println("given number is not bellow hundred");
		}

	}

}
