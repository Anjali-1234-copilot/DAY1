public class M5Q8 {

    static class MyLifecycleThread extends Thread {
        @Override
        public void run() {
            System.out.println("Inside run(), state: " + getState());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Exiting run()");
        }
    }

    public static void main(String[] args) {
        MyLifecycleThread t = new MyLifecycleThread();

        System.out.println("State after creation: " + t.getState()); // NEW

        t.start();
        System.out.println("State after start(): " + t.getState()); // RUNNABLE

        try {
            Thread.sleep(50);
            System.out.println("State while running (after small sleep): " + t.getState());

            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State after completion: " + t.getState()); // TERMINATED
    }
}
