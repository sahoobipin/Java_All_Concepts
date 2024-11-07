package com.bbs.multhithreading;

public class ThreadB implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("my child thread");
		}

	}

}

class B {
	public static void main(String[] args) {
		ThreadB r = new ThreadB();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}
}
