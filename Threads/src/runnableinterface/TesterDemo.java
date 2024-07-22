package runnableinterface;

public class TesterDemo extends Tester implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hi Hello World");
			try {
				Thread.sleep(1500);
			}
			catch(InterruptedException exception)
			{
				exception.printStackTrace();
			}
		}
	}

}
