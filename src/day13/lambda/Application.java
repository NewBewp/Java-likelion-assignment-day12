package day13.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {

//        //day la cach thong thuong
//        BaseImp imp = new BaseImp();
//        imp.Say("kien");
//        //
//        BaseInterface imp2 =(name)->{
//            System.out.println("Lambda Imp" + name);
//        };
//        imp2.Say("Lambda kien");
//
//        CaculateInterface caIn = (x,y)->{
//            return x * y;
//        };
//        System.out.println(caIn.caculator(4,6));
//
        List<String> list = new ArrayList<>();
        list.add("Lambda 1");
        list.add("Lambda 2");
        list.add("Lambda 3");

        list.forEach((e)->{
            System.out.println(e);
        });

        list.forEach(System.out::println);

        Function<String,Integer> func = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        System.out.println(func.apply("1"));

        Function<String, Integer> func2 = str -> Integer.parseInt(str);
        System.out.println(func2.apply("2"));

        Function<String, Integer> func3 = Integer::parseInt;
        System.out.println(func3.apply("3"));
    }
}
