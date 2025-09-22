package Practic9.stream_api_agroperation.Task4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Апельсин", "Яблоко", "Банан", "Киви", "Брусника");
        Optional<String> firstMatch = words.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();
        if (firstMatch.isPresent()) {
            System.out.println("Найдено: " + firstMatch.get());
        } else {
            System.out.println("Ни одного элемента не найдено.");
        }
    }
}
