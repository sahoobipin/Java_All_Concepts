package com.bbs.exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			System.out.println("learn coding");
			int a = 10, b = 2, c;
			c = a / b;
			System.out.println(c);
			System.out.println("like share");
		} catch (ArithmeticException e) {
			System.out.println("can't devide by zero");
		} finally {
			System.out.println("suscribe");
		}
		System.out.println("main method ended");
	}
}
