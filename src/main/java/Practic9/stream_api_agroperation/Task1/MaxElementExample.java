package Practic9.stream_api_agroperation.Task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxElementExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> max = numbers.stream()
                .max(Comparator.naturalOrder());
        max.ifPresent(value -> System.out.println("Максимальное число: " + value));
    }
}
