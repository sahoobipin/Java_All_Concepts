package com.bbs.constructor;

public class ThisKeyWord {
	double width, height, depth;

	ThisKeyWord(double w, double h, double d) {
		this.width = w;
		this.height = h;
		this.depth = d;

	}

	public static void main(String[] args) {

		ThisKeyWord d = new ThisKeyWord(10, 20, 30);

		System.out.println(d.depth);
		System.out.println(d.height);
		System.out.println(d.width);
	}

}
