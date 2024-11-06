package com.bbs.constructor;

public class ConstructorOverLoading {
	int age;
	String name;

	public ConstructorOverLoading(int a, String n) {

		age = a;
		name = n;
	}

	public ConstructorOverLoading(String b) {
		name = b;
	}

	public static void main(String[] args) {
		ConstructorOverLoading co = new ConstructorOverLoading(20, "bbs");
		System.out.println(" age " + co.age);
		System.out.println(" name " + co.name);

		ConstructorOverLoading co2 = new ConstructorOverLoading("chandan");
		System.out.println("name:" + co2.name);

	}
}
