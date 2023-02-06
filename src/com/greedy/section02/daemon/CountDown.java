package com.greedy.section02.daemon;

public class CountDown extends Thread {

	@Override
	public void run() {
		 for(int i = 50; i >= 0; i--) {
			 try{
				 System.out.println(i);
				 Thread.sleep(500);
			 } catch (InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
	}
}
