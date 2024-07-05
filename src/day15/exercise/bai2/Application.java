package day15.exercise.bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        int[] arr = {10,23,22,23,24,24,33,15,26,15};
        Arrays.stream(arr).distinct().forEach(s -> System.out.print(s+" "));
    }
}
