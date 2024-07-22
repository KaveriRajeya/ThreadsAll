package thread1;


public class Thread3 implements Runnable {
	public void run() {
		System.out.println("Thread name are following");
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		Thread3 t1 = new Thread3();   //thread
		Thread thread1 = new Thread(t1,"thread1");  //(runnable r, String  name)
		Thread thread2 = new Thread(t1); //(runnable r)
		Thread thread3 = new Thread("thread3"); //Thraed(String name)
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}