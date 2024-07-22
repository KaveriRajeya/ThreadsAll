package multithreadingconcepts;

public class ThreadDeadlock {

    // creating two objects called resources
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Task1()); 
        Thread t2 = new Thread(new Task2());
        //t1 and t2 create two threads and starts them

        t1.start(); //executes task1
        t2.start(); //executes task2
    }

   // to lock task1 then going to lock task2
    private static class Task1 implements Runnable {
        public void run() {
            synchronized (resource1) {
                System.out.println("Task 1: Locked task 1");

                try {
                	Thread.sleep(1000); //pausing the execution for 1sec
                	} 
                catch (InterruptedException e) 
                {
                	e.printStackTrace(); // calling the the reference variable(e)
                }

                synchronized (resource2) {
                    System.out.println("Task 1: Locked task 2");
                }
            }
        }
    }

   //to lock second task then going to lock task1
    private static class Task2 implements Runnable {
        public void run() {
            synchronized (resource2) {
                System.out.println("Task 2: Locked task 2");

                try { 
                	Thread.sleep(1000); //pausing the execution for 1sec
                	} 
                catch (InterruptedException e) 
                {
                	e.printStackTrace(); // calling the the reference variable(e)
                }

                synchronized (resource1) {
                    System.out.println("Task 2: Locked task 1");
                }
            }
        }
    }
}