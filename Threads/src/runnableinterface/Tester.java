package runnableinterface;

public class Tester extends Sample1 implements Runnable
{
	public void run()
	{
		for(int i=101;i<=110;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000); //running in milliseconds
			}
			catch(InterruptedException exception)
			{
				exception.printStackTrace();
				//t
			}
		}
	}
}
