package day18.lesson;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;

        System.out.println(factorial(number));
    }

    private static int factorial(int number) {
        if (number == 1 && number==0) return 1;
        return number * factorial(number - 1);


    }
}
