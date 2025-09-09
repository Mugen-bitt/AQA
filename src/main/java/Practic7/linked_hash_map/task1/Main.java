package Practic7.linked_hash_map.task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> counties = new LinkedHashMap<>();

        counties.put("Россия", "Москва");
        counties.put("Япония", "Токио");
        counties.put("Франция", "Париж");
        counties.put("Германия", "Берлин");
        counties.put("Бразилия", "Бразилиа");

        for (Map.Entry<String, String> entry : counties.entrySet()){
            System.out.println("Страна: " + entry.getKey() + ", Столица: " + entry.getValue());
        }

    }
}
