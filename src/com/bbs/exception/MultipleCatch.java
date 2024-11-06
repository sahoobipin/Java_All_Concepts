package com.bbs.exception;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int a = 10, b = 2, c;
			c = a / b;
			System.out.println(c);

			int arr[] = { 10, 20, 30 };
			System.out.println(arr[0]);

			String s = "bipin";
			System.out.println(s.toUpperCase());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array excepetion");
		} catch (ArithmeticException e) {
			System.out.println("Arethemetic excepetion");
		} catch (NumberFormatException e) {
			System.out.println("number exception");
		}
	}
}
