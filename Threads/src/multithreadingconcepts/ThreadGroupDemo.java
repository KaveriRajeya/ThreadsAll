package multithreadingconcepts;

public class ThreadGroupDemo implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		ThreadGroupDemo demo = new ThreadGroupDemo();

		ThreadGroup tg1 = new ThreadGroup("parent");

		Thread t1 = new Thread(tg1, demo, "one");
		Thread t2 = new Thread(tg1, demo, "two");
		Thread t3 = new Thread(tg1, demo, "three");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Thread Group Name: "+tg1.getName());
		tg1.list();
		

		

	}

}
