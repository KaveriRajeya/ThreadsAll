package thread1;

public class Thread5 implements Runnable {
	public void run() {
		System.out.println("Thread5 run method..");
	}

	public static void main(String[] args) {
		Thread5 t1 = new Thread5();
		Thread t11 = new Thread(t1);
		Thread thread1 = new Thread("thread1ndf");
		Thread thread2 = new Thread("thread2ndf");
		thread1.start();
		thread2.start();
		t11.start();
		System.out.println("Threads names are following: ");
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());

	}

	

}

