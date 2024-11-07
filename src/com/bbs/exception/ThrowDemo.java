package com.bbs.exception;

public class ThrowDemo {
	public static void main(String[] args) {
		//System.out.println(10 / 0);
		throw new ArithmeticException("/by zero");
	}

}
