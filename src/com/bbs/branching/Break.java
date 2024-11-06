package com.bbs.branching;

public class Break {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				break;
			}
			System.err.println(i);
		}
	}

}
