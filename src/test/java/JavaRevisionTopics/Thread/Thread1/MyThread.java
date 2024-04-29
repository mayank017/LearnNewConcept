package JavaRevisionTopics.Thread.Thread1;

public class MyThread implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 6; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        }
    }
}
