package day16.exercise;

//public class ThreadOdd extends Thread{
//
//    public void findOdd() {
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 != 0) {
//                System.out.println("Odd number: "+i);
//            }
//        }
//    }
//    @Override
//    public void run() {
//        try{
//            Thread.sleep(1000);
//            this.findOdd();
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//        }
//
//    }


class ThreadOdd implements Runnable {
    @Override
    public void run() {
        Runtime runtime = Runtime.getRuntime();

        for (int i = 2; i <= 20; i += 1) {
            try {
                Thread.sleep(100);
                if (i % 2 != 0) {
                    System.out.println("Odd: " + i);// Simulate some work with sleep

                }


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
