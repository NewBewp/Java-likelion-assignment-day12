package day15.exercise.bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14};
        Sum(arr);
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14);
        SumColect(numberList);
    }

    public static void Sum(int[] arr) {
        int a = Arrays.stream(arr).filter(s -> s % 2 == 0).sum();
        System.out.println(a);
        int b = Arrays.stream(arr).filter(s -> s % 2 != 0).sum();
        System.out.println(b);
    }

    public static void SumColect(List<Integer> numberList){
        int sumE = 0;
        for(Integer i : numberList){
            if (i % 2 == 0){
                sumE += i;
            }
        }
        System.out.println(sumE);

    }

}
