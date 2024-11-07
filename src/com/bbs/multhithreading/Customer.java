package com.bbs.multhithreading;

class Customer {
	public static void main(String[] args) {
		Bus b = new Bus(1);
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);

		t1.setName("ram");
		t2.setName("shayama");
		t3.setName("gopal");

		t1.start();
		t2.start();
		t3.start();
	}
}
