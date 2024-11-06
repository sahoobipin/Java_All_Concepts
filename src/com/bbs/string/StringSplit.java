package com.bbs.string;

public class StringSplit {
	public static void main(String[] args) {
		String s1 = "bipinbsahoo";
		String[] split = s1.split("oo");
		for (String s : split)
			System.out.println(s);
	}

}
