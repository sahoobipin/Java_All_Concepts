package com.bbs.inheritance;

public class Vechile {
	String vechileType;
}

class Car extends Vechile {
	String ModelType;

	public void showdetails() {
		vechileType = "car";
		ModelType = "Sports";
		System.out.println(ModelType + " " + vechileType);

	}

	public static void main(String[] args) {
		Car car = new Car();
		car.showdetails();
	}
}
