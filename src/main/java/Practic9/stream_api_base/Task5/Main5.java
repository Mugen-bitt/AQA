package Practic9.stream_api_base.Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Яблоко", "Банан", "Инжир", "Киви", "Ананас", "Банан");
        List<String> uniqueWords = words.stream()
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println("Уникальные слова: " +  uniqueWords);
    }
}
