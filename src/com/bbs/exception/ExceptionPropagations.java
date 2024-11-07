package com.bbs.exception;

public class ExceptionPropagations {
	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		try {
			m2();
		} catch (ArithmeticException e) {
			System.out.println("excepetion handeled");
		}

	}

	public static void m2() {
		System.out.println(10 / 0);
	}

}
