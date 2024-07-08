package day16.lesson;

public class Person2 extends Thread{
    private String name;

    public Person2(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread 2");
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
    }
}
