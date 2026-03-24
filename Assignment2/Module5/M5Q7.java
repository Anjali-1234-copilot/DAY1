public class M5Q7 {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    class Task1 implements Runnable {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Task1: Holding lock1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task1: Waiting for lock2...");
                synchronized (lock2) {
                    System.out.println("Task1: Acquired lock2");
                }
            }
        }
    }

    class Task2 implements Runnable {
        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Task2: Holding lock2...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task2: Waiting for lock1...");
                synchronized (lock1) {
                    System.out.println("Task2: Acquired lock1");
                }
            }
        }
    }

    public static void main(String[] args) {
        M5Q7 demo = new M5Q7();

        Thread t1 = new Thread(demo.new Task1(), "Thread-1");
        Thread t2 = new Thread(demo.new Task2(), "Thread-2");

        t1.start();
        t2.start();
    }
}
