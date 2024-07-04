package day14.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

//Viết chương trình Java để triển khai biểu thức lambda nhằm tìm giá trị trung bình của một danh sách các số double.
public class Application {
    public static void main(String[] args) {
        double[] doublesNumbers = {2.3,5.2,5.4};
        OptionalDouble doublesList = Arrays.stream(doublesNumbers).average();
        doublesList.ifPresent(averageDouble -> System.out.println(averageDouble));

//        Arrays.stream(doublesNumbers).average().ifPresent(System.out::println);
    }
}
