package com.bbs.exception;

public class NestedFinally {
	public static void main(String[] args) {
		try {
			String s = "bbs";
			System.out.println(s.toUpperCase());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				System.out.println(10 / 0);

			} catch (ArithmeticException e2) {

				System.out.println("learn coding");
			}

		}
	}
}
