package com.bbs.multhithreading;

public class Table {
	public void printTable(int n) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(n * i);
		}
	}
}

class thread1 extends Thread {
	Table t;

	thread1(Table t) {
		this.t = t;

	}

	public void run() {
		t.printTable(5);
	}
}

class thread2 extends Thread {
	Table t;

	thread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(7);
	}

}

class main {
	public static void main(String[] args, Table obj) {
		Table t = new Table();
		thread1 t1 = new thread1(obj);
		thread1 t2 = new thread1(obj);

		t1.start();
		t2.start();
	}
}
