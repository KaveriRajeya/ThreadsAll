package runnableinterface;

public class Sample1 extends Thread implements Runnable {
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Starting  thread ---- 1");
			System.out.println(i);
			try {
				Thread.sleep(1000); //running in milliseconds
			}
			catch(InterruptedException exception)
			{
				exception.printStackTrace();
			}
		}
	}
}


