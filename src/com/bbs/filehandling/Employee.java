package com.bbs.filehandling;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	int age;
	String name;

	public Employee(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

}
