package day16.exercise;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Runnable t = new ThreadOdd();
        Thread t2 = new ThreadEven();
        Thread t1 = new Thread(t);
//        synchronized (t2) {
//
//            t2.start();
//            t2.join();
//            t2.notify();
//        }
//        synchronized (t1) {
//
//            t1.start();
//            t1.join();
//            t1.notify();
//        }

        t1.start();
        t2.start();
    }
}