package Practic9.stream_api_agroperation.Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinElementExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 54, 1, 67, 5, 3);
        Optional<Integer> min = numbers.stream()
                .min(Comparator.naturalOrder());
        min.ifPresent(value -> System.out.println("Минимальное число: " + value));
    }
}
