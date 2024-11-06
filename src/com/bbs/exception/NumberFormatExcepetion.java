package com.bbs.exception;

public class NumberFormatExcepetion {
	public static void main(String[] args) {
		String s = "bipin";
		try {
			int a = Integer.parseInt(s);
			System.out.println(a);
			System.out.println("string formatExcepetion");
		} catch (NumberFormatException e) {
			System.out.println("string "+ s + " can't be converted to integer");
		}
	}
}
