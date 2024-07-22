package multithreadingconcepts;

public class TestJoin extends Thread {
	public void run() {
		for(int i=1; i<6; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " :: " + i);
			//Returns the Thread object for the current thread
		}
	}
	public static void main(String[] args) {
		TestJoin t1 = new TestJoin();
		TestJoin t2 = new TestJoin();
		TestJoin t3 = new TestJoin();
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
		}
		t2.start();
		t3.start();
	}

}

