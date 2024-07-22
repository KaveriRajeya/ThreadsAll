package multithreadingconcepts;

public class TestDaemon extends Thread {
	public void run() {
		if (ThreadSleep.currentThread().isDaemon()) {// checking for daemon thread
			//Current Thread is a static method of thread class which returns instance of currently executing threads.
			System.out.println(Thread.currentThread().getName()+" daemon thread is working");
									// returns the Thread Object Of Current Thread.
		} else {
			System.out.println(Thread.currentThread().getName()+" user thread is working");
		}
	}

	public static void main(String[] args) {
		TestDaemon t1 = new TestDaemon();// creating thread
		TestDaemon t2 = new TestDaemon();

		t1.setDaemon(true);// now t1 is daemon thread

		t1.start();// starting threads
		t2.start();
	}
}