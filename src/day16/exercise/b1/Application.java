package day16.exercise.b1;

public class Application {

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumbers());
        Thread oddThread = new Thread(new OddNumbers());

        evenThread.start();
        oddThread.start();



    }
}