package thread1;

public class TestDaemon extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println(Thread.currentThread().getName()+" daemon thread work");
		} else {
			System.out.println(Thread.currentThread().getName()+" user thread work");
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