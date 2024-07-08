package day16.lesson;

public class Account extends Thread{
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withDraw (double amount){
        this.balance = balance - amount;
        if( this.balance >= amount){
            this.balance = this.balance - amount;
            System.out.println(this.balance);
        }else {
            System.out.println("Het tien");
            System.out.println(this.balance);
        }
    }

    @Override
    public void run() {
        this.withDraw(10);
    }
}
