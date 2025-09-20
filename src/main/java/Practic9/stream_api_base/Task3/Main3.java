package Practic9.stream_api_base.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Яблоко", "Банан", "Киви", "Клубника");
        List<Integer> length = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Длина строк: " + length);
    }
}
