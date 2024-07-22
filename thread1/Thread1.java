package thread1;

//public class Thread1 {

//}
//package com.basavaraja.threads;

class Thread1 extends Thread {
	public void run() {
		System.out.println("Thread1 is running");
	}

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();

	}

}
