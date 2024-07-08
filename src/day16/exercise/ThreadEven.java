package day16.exercise;

//public class ThreadEven extends Thread {
//    public void findEven(){
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println("Even number: " + i);
//            }
//        }
//    }
//
//    @Override
//    public void run() {
//        try{
//            Thread.sleep(1000);
//            this.findEven();
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//        }
//    }
//}

class ThreadEven extends Thread {
    @Override
    public void run() {

        for (int i = 2; i <= 20; i += 1) {

            try {
                Thread.sleep(100);
                if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
