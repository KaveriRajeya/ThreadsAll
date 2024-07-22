package thread1;

public class Threadsleep extends Thread{
	public void run() {
		for(int i=1; i<5; i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Threadsleep t1 = new Threadsleep();
		Threadsleep t2 = new Threadsleep();
		Threadsleep t3 = new Threadsleep();
		
		t1.start();
		t2.start();
		t3.start();

	}
	
	
}