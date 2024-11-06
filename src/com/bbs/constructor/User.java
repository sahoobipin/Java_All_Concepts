package com.bbs.constructor;

public class User {
	int age;
	String name;

	public User(int age, String name) {
		//initialization
		this.age = age;   
		this.name = name;
	}

	public static void main(String[] args) {
		User u = new User(20, "bbs");
		System.out.println(u.age);
		System.out.println(u.name);
	}

}
