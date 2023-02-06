package com.greedy.section01.thread;

public class Plane implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Plane Flight...");

			try {
				/* 스레드를 일시 정지 시키는 메소드*/
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}