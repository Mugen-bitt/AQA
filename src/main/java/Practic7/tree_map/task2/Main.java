package Practic7.tree_map.task2;

import java.util.Stack;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> scores = new TreeMap<>();

        scores.put("Павел", 90);
        scores.put("Арина", 50);
        scores.put("Виктор", 70);
        scores.put("Гоша", 68);
        scores.put("Дмитрий", 78);

        String minKey = scores.firstKey();
        String maxKey = scores.lastKey();

        System.out.println("Минимальный ключ: " + minKey);
        System.out.println("Максимальный ключ: " + maxKey);
    }
}
