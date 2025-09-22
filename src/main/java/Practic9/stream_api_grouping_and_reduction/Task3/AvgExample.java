package Practic9.stream_api_grouping_and_reduction.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AvgExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        double average = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println("Среднее значение: "  + average);
    }
}
