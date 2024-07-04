package day14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("PHP","Java","C#","Python","C++","C");

        Stream<String> stream = list.stream()
                .filter(s -> s.toLowerCase().startsWith("j"));
        stream.forEach(System.out::println);

        String password = "Likelion2024";
        String encode = Base64.getEncoder().encodeToString(password.getBytes());
        System.out.println(encode);

        byte[] decoded =Base64.getDecoder().decode(encode);
        String decodedString = new String(decoded);
        System.out.println(decodedString);

    }
}
