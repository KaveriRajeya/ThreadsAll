package multithreadingconcepts;

public class ThreadMain extends Thread {
	  public static int amount = 0;

	  public static void main(String[] args) {
	    ThreadMain thread = new ThreadMain();
	    thread.start();
	    // Waiting for the thread to finish
	    while(thread.isAlive()) //isAlive method is used to prevent concurrency problems checking whether the thread is alive or not
	    {
	      System.out.println("Waiting...");
	    }
	    // Update amount and print its value
	    System.out.println("Main: " + amount);
	    amount++;
	    System.out.println("Main: " + amount);
	  }
	  public void run() {
	    amount++;
	  }
	}