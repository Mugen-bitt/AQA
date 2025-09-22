package Practic9.stream_api_grouping_and_reduction.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> grouped = numbers.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0));

        grouped.forEach((isEven, group) -> {
            String label = isEven ? "Четные" : "Нечетные";
            System.out.println(label + ": " + group);
        });
    }
}
