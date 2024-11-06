package com.bbs.exception;

public class NestedCatch {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			try {
				String a = null;
				System.out.println(a.toLowerCase());

			} catch (NullPointerException e2) {
				System.out.println("null value can't converted");
			}

		}
		System.out.println("main method ended");
	}

}
