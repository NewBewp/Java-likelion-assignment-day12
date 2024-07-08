package day16.exercise.b1;

public class OddNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
            try {
                // Sleep to ensure thread alternates execution
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
