class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread class running: " + getName());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable interface running in thread: " + Thread.currentThread().getName());
    }
}

public class M5Q5 {
    public static void main(String[] args) {
        // Creating thread by extending Thread class
        MyThread t1 = new MyThread("Thread-Extends-Thread");

        // Creating thread by implementing Runnable interface
        Runnable runnable = new MyRunnable();
        Thread t2 = new Thread(runnable, "Thread-From-Runnable");

        t1.start();
        t2.start();

        System.out.println("Difference:");
        System.out.println("- Extending Thread: cannot extend any other class.");
        System.out.println("- Implementing Runnable: can still extend another class.");
    }
}
