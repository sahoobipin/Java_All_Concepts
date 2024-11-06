package com.bbs.numberpgm;

import java.util.Scanner;

public class SumOfTwoNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter the 1 st number");
		int i = scn.nextInt();

		System.out.println("enter the 2 nd number");
		int j = scn.nextInt();

		int sum = i + j;
		System.out.println("result:" + sum);
	}

}
