package Practic9.stream_api_grouping_and_reduction.Task1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Апельсин", "Яблоко", "Банан", "Киви", "Брусника");
        Map<Character, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));
        grouped.forEach((letter, group) -> System.out.println(letter + " -> " + group));
    }
}
