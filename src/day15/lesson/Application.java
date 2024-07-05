package day15.lesson;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        // Tạo ra 1 doi tuong optional rong
        Optional<String> opt = Optional.empty();

        // tao ra 1 doi tuong non-null(co the co gia tri hoac empty)
        String str = "";
        Optional<String> opt2 = Optional.of(str);
        System.out.println( opt2.isPresent());

        // taoj ra 11 doi tuong cho phep null hoac non-null
        String str2 = "";
        Optional<String> opt3 = Optional.ofNullable(str2);


    }
}
