package thread1;

class Thread2 implements Runnable  {
	public void run() {
		System.out.println("Thread2 is running");
	}

	void m1() {
		System.out.println("M1.......");

	}

	public static void main(String[] args) {
		Thread2 t2 = new Thread2();
		Thread t3 = new Thread(t2);
		t3.start();
		t2.m1();

	}

}
