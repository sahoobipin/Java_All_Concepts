package com.bbs.exception;

public class TestThrowvsThrows {
	void div(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			int c = a / b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		TestThrowvsThrows t = new TestThrowvsThrows();
		try {
			t.div(20, 0);
		} catch (Exception e) {
			System.out.println("div zero");
		}

	}
}
