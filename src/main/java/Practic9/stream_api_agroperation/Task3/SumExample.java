package Practic9.stream_api_agroperation.Task3;

import java.util.Arrays;
import java.util.List;

public class SumExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println("Сумма: " + sum);
    }
}
