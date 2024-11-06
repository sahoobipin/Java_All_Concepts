package com.bbs.exception;
// we  will know the exception in runtime
public class NulPointerExc {

	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.toUpperCase());
		} catch (NullPointerException e) {
			System.out.println("null can't be casted");
		}

	}

}
