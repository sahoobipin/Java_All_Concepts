package com.bbs.operators;

public class Conditional {

	public static void main(String[] args) {

		int a, b;
		a = 20;
		b = (a == 1) ? 30 : 40;
		System.out.println("value of b is :" + b);
		b = (a == 20) ? 30 : 40;
		System.out.println("value of b is " + b);
	}

}