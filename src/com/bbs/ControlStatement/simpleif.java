package com.bbs.ControlStatement;

import java.util.Scanner;

public class simpleif {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();

		if ((n % 5)== 0) {
			System.out.println("given number is divisible by 5");
		}
		else {
			System.out.println("not divisible by 5");
		}
	}

}
