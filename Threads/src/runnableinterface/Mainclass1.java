package runnableinterface;

public class Mainclass1 {
	public static void main(String[] args) {
		
		Sample1 sample1=new Sample1();
		Thread thread1=new Thread(sample1);
		thread1.start();
		
		Tester tester=new Tester();
		Thread thread2=new Thread(tester);
		thread2.start();
		
		TesterDemo testerDemo=new TesterDemo();
		Thread thread=new Thread(testerDemo);
		thread.start();
		
	}

}
