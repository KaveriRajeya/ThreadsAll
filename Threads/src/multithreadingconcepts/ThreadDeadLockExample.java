package multithreadingconcepts;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDeadLockExample {

    private static final Lock lock1 = new ReentrantLock(); // creates an instance which returns false
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        // Thread 1 tries to occupying lock1
        Thread thread1 = new Thread(() -> {
            lock1.lock();
            try {
                System.out.println("Thread 1: Holding lock1...");

                try {
                    Thread.sleep(50); // application is executing in milliseconds with lock 1 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: Waiting for lock2...");
                lock2.lock();
                try {
                    System.out.println("Thread 1: Holding lock1 and lock2...");
                } finally {
                    lock2.unlock();
                }
            } finally {
                lock1.unlock();
            }
        });

        // Thread 2 tries to occupying lock2
        Thread thread2 = new Thread(() -> {
            lock2.lock();
            try {
                System.out.println("Thread 2: Holding lock2...");

                try {
                    Thread.sleep(50); // application is executing in milliseconds with lock 2
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: Waiting for lock1...");
                lock1.lock();
                try {
                    System.out.println("Thread 2: Holding lock2 and lock1...");
                } finally {
                    lock1.unlock();
                }
            } finally {
                lock2.unlock();
            }
        });

        // Starting both threads
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
    }
}