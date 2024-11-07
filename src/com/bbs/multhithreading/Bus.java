package com.bbs.multhithreading;

public class Bus implements Runnable {

	int avaliable = 1, passanger;

	public Bus(int passenger) {
		this.passanger = passenger;
	}

	@Override
	public synchronized void run() {

		String name = Thread.currentThread().getName();
		if (avaliable >= passanger) {
			System.out.println(name + "reserved seat...!");
			avaliable = avaliable - passanger;
		} else {
			System.out.println("sorry seat are not avaliable");
		}

	}

}
