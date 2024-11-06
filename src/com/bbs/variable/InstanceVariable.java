package com.bbs.variable;

//non-static variable or global variable or instance variable
public class InstanceVariable {
	int age;// instance variable

	public static void main(String[] args) {

		InstanceVariable raju = new InstanceVariable();
		raju.age = 24;// initialization of variable
		System.out.println(raju.age);
	}
}
