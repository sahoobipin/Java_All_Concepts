package com.bbs.varargsmethod;

public class A {
	void add(int... a)// var args method
	{
		int sum = 0;
		for (int x : a) {
			sum = sum + x;
		}
		System.out.println("sum of number :"+ sum);

	}
}

class Demo {
	public static void main(String[] args) {
		A abc = new A();
		abc.add();
		abc.add(10, 20);
		abc.add(10, 20, 30);
		abc.add(10, 20, 30, 40, 50);
	}
}
