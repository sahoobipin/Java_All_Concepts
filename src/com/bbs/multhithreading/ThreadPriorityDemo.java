package com.bbs.multhithreading;

public class ThreadPriorityDemo extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

}

class Z {
	public static void main(String[] args) {
		ThreadPriorityDemo d1 = new ThreadPriorityDemo();
		ThreadPriorityDemo d2 = new ThreadPriorityDemo();
		ThreadPriorityDemo d3 = new ThreadPriorityDemo();

		d1.setName("d1 thread");
		d2.setName("d2 thread");
		d3.setName("d3 thread");

		d1.setPriority(2);
		d2.setPriority(7);
		d3.setPriority(10);

		d1.start();
		d2.start();
		d3.start();
	}
}
