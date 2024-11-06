package com.bbs.exception;

public class NestedTry {
	public static void main(String[] args) {
		try {

			try {
				int a[] = { 1, 3, 5, 6 };
				System.out.println(a[2]);
			} catch (ArithmeticException e) {

				System.out.println(e);

			}
			System.out.println(10 / 0);

		} catch (ArithmeticException e) {

			System.out.println(e);
		}
		System.out.println("learncode");

	}

}
