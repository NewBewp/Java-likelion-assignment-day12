package day16.lesson;

public class Person implements Runnable{
    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread 1");
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
    }
}
