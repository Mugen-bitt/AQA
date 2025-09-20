package Practic9.stream_api_base.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Яблоко", "Груша", "Персик", "Киви", "Виноград", "Арбуз");
        List<String> filtered = words.stream()
                                     .filter(word -> word.length() > 5)
                                     .collect(Collectors.toList());
        System.out.println("Строки длиннее 5 символов: " +  filtered);
    }
}
