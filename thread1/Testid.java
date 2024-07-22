package thread1;

public class Testid implements Runnable {
	public void run() {
		System.out.println("Thread name are following: ");
		System.out.println(Thread.currentThread().getName());
		System.out.println("running");
	}

	public static void main(String[] args) {
		Testid t1 = new Testid();
		Thread t2 = new Thread(t1);
		Testid t3 = new Testid();
		Thread t4 = new Thread(t3);
		
		//System.out.println("id of t1: " + t2.getId());
		//System.out.println("id of t1: " + t4.getId());
		t2.start();
	    t4.start();
	    t2.setName("hi hello");
	    System.out.println("After changing name of thread::" + t2.getName());
	    

	}

}

