package day16.lesson;

public class Application {
    public static void main(String[] args) {
        Runnable r = new Person("Kien");
        Thread t = new Thread(r);

        Runnable r2 = new Person2("Kien2");
        Thread t2 = new Thread(r2);

//        t.start();
//        t2.start();




    }
}
