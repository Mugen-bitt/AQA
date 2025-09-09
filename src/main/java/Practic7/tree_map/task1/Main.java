package Practic7.tree_map.task1;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> scores = new TreeMap<>();

        scores.put("Павел", 90);
        scores.put("Арина", 50);
        scores.put("Виктор", 70);
        scores.put("Гоша", 68);
        scores.put("Дмитрий", 78);

        for (Map.Entry<String, Integer> entry : scores.entrySet()){
            System.out.println("Имя: " + entry.getKey() + ", Баллы: " + entry.getValue());
        }
    }
}
