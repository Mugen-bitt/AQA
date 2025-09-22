package Practic9.stream_api_agroperation.Task5;

import java.util.Arrays;
import java.util.List;

public class CheckElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 7, 8, 9);
        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println("Четные числа: " +  hasEven);
    }
}
