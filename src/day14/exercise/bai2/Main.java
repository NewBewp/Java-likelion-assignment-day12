package day14.exercise.bai2;

import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int[] array = {3,7,18,25,77,300,101};
        findSecondMaxAndMin(array);


        int a = 1;
        double b=1.0;

        System.out.println(a==b);
    }

    public static void findSecondMaxAndMin(int[] array) {
        System.out.println(Arrays.stream(array).min().getAsInt());
        int[] sortedArray = Arrays.stream(array).sorted().toArray();


        int min = sortedArray[0];
        System.out.println(min);
        int maxSecond = sortedArray[sortedArray.length - 2];
        System.out.println(maxSecond);
    }
}
