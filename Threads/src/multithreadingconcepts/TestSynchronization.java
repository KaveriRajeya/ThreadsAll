package multithreadingconcepts;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Table1 {
    private final Lock lock = new ReentrantLock();

    void display(int n) {
        lock.lock(); // Acquire the lock
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + (n * i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        } finally {
            lock.unlock(); // Release the lock
        }
    }
}

class MyThread1 extends Thread {
    Table1 table;

    MyThread1(Table1 table) {
        this.table = table;
    }

    public void run() {
        table.display(1);
    }
}

class MyThread2 extends Thread {
    Table1 table;

    MyThread2(Table1 table) {
        this.table = table;
    }

    public void run() {
        table.display(2);
    }
}

class MyThread3 extends Thread {
    Table1 table;

    MyThread3(Table1 table) {
        this.table = table;
    }

    public void run() {
        table.display(3);
    }
}

class MyThread4 extends Thread {
    Table1 table;

    MyThread4(Table1 table) {
        this.table = table;
    }

    public void run() {
        table.display(4);
    }
}

class MyThread5 extends Thread {
    Table1 table;

    MyThread5(Table1 table) {
        this.table = table;
    }

    public void run() {
        table.display(5);
    }
}

class MyThread6 extends Thread {
    Table1 table;

    MyThread6(Table1 table) {
        this.table = table;
    }

    public void run() {
        table.display(6);
    }
}

class MyThread7 extends Thread {
    Table1 table;

    MyThread7(Table1 table) {
        this.table = table;
    }

    public void run() {
        table.display(7);
    }
}

class MyThread8 extends Thread {
    Table1 table;

    MyThread8(Table1 table) {
        this.table = table;
    }

    public void run() {
        table.display(8);
    }
}

class MyThread9 extends Thread {
    Table1 table;

    MyThread9(Table1 table) {
        this.table = table;
    }

    public void run() {
        table.display(9);
    }
}

public class TestSynchronization {
    public static void main(String args[]) {
        Table1 table = new Table1();  // Create a single Table1 object

        // Create multiple threads that share the same Table1 object
        MyThread1 t1 = new MyThread1(table);
        MyThread2 t2 = new MyThread2(table);
        MyThread3 t3 = new MyThread3(table);
        MyThread4 t4 = new MyThread4(table);
        MyThread5 t5 = new MyThread5(table);
        MyThread6 t6 = new MyThread6(table);
        MyThread7 t7 = new MyThread7(table);
        MyThread8 t8 = new MyThread8(table);
        MyThread9 t9 = new MyThread9(table);

        // Name the threads for better identification
        t1.setName("Thread-1:");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t4.setName("Thread-4");
        t5.setName("Thread-5");
        t6.setName("Thread-6");
        t7.setName("Thread-7");
        t8.setName("Thread-8");
        t9.setName("Thread-9");

        // Start and join threads sequentially to ensure ordered execution
        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

            t4.start();
            t4.join();

            t5.start();
            t5.join();

            t6.start();
            t6.join();

            t7.start();
            t7.join();

            t8.start();
            t8.join();

            t9.start();
            t9.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished execution.");
    }
}
