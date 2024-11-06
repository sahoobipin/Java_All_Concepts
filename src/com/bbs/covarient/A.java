package com.bbs.covarient;

public class A {

	A m1() {
		System.out.println("this is the method returntype is class ");
		return this;
	}
}

class B extends A {
	@Override

	B m1() {
		super.m1();
		System.out.println("this is the method whose rerurn type is class B , "
				+ "and return type i can choose this or i can return like the way bellow ");
		return new B();
	}
}

class Test {
	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}
}
