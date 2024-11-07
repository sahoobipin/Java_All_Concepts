package com.bbs.multhithreading;

//how multiple thread works 
public class ThreadA extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 1; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.run();
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadA t = new ThreadA();
		t.run();
		for (int j = 1; j < 5; j++) {
			System.out.println(j);
			Thread.sleep(1000);
		}
	}
}
