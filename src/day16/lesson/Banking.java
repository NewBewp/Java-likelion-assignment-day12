package day16.lesson;

public class Banking implements Runnable{
    private Account account;

    public Banking ( Account account) {
        this.account = account;
    }

    public void run() {
        account.withDraw(10);
    }
}
