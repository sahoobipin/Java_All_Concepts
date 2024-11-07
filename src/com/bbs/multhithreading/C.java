package com.bbs.multhithreading;

//thread schedular 
public class C extends Thread {
	@Override
	public void run()
	{
		String n = Thread.currentThread().getName();
		for (int i = 1; i <= 3; i++) 
		{
			System.out.println(n);
		}

	}

}

class E {
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C();
		C c3 = new C();

		c1.setName("thread1");
		c2.setName("thread2");
		c3.setName("thread3");

		c1.start();
		c2.start();
		c3.start();
	}

}
