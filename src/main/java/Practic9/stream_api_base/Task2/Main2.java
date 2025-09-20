package Practic9.stream_api_base.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> divisibleBy5 = numbers.stream()
                .filter(num -> num % 5 == 0)
                .collect(Collectors.toList());
        System.out.println("Числа, кратные 5: " +  divisibleBy5);
    }
}
