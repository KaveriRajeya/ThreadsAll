package thread1;

public class TestRun extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TestRun t1 = new TestRun();
		TestRun t2 = new TestRun();

		t1.run();
		t2.run();

	}

}