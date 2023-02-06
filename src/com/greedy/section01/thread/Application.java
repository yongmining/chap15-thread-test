package com.greedy.section01.thread;

public class Application {

	public static void main(String[] args) {
		/* 프로세스와 스레드
		 * 프로세스는 실행중인 프로그램이라고 할 수 있다.
		 * 스레드는 프로세스 내에서 실제로 작업을 수행하는 주체를 의미한다.
		 * 모든 프로세스는 한 개 이상의 스래드가 존재하며
		 * 두 개 이상의 스레드를 가지는 프로세스를 멀티스레드라고 한다.
		 * 
		 * 스레드를 생성하는 방법
		 * 1. Thread 클래스를 상속받는 방법
		 * 2. Runnable 인터페이스를 상속받는 방법 */
	
//		Car car = new Car();
//		Tank tank = new Tank();
//		Plane plane = new Plane();
//		
		/* Thread 타입의 인스턴스로 변환 */
//		Thread t1 = car;
//		Thread t2 = tank;
//		Thread t3 = new Thread(plane);
		
		Thread t1 = new Car();
		Thread t2 = new Tank();
		Thread t3 = new Thread(new Plane());
		
//		t1.run();
//		t2.run();
//		t3.run();
		
		t1.setPriority(Thread.MAX_PRIORITY); //10
		t3.setPriority(Thread.MIN_PRIORITY); //1
		
		System.out.println("t1의 우선순위 : " + t1.getPriority());
		System.out.println("t2의 우선순위 : " + t2.getPriority());
		System.out.println("t3의 우선순위 : " + t3.getPriority());
		
		
		t1.start();
		t2.start();
		t3.start();
		
		/* 지정한 쓰레드가 종료될 때 까지 현재 쓰레드(메인 쓰레드)를 일시 정지 시킨다. */
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------- main end!!!");
	
	}

}
