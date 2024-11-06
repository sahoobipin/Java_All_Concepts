package com.bbs.exception;

public class Test {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("can't devided by Zero");
		}
		System.out.println("main method ended");
	}
}
