package cl12Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "acc bcc",
                "aaa qwe asdf",
                "abb qwe kjf"
        );

        List<String> list = strings
                .stream()
                .flatMap(x -> Arrays.stream(x.split("\\s+")))
                .filter(x -> x.startsWith("a"))
                .sorted()
                .map(String::toUpperCase)
                .filter(x -> x.length() <=3)
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
