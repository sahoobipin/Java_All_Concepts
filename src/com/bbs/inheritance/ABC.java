package com.bbs.inheritance;

public class ABC {
	 public void m1() {
		System.out.println("parent method");
	}
}
class B extends ABC {
	
	public void m2() {
		System.out.println("child class");
	}
	public static void main(String[] args) {
		B bbs = new B();
		bbs.m2();
		bbs.m1();
	}

}
