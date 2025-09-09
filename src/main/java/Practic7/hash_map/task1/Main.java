package Practic7.hash_map.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();

        people.put("Павел", 34);
        people.put("Игорь", 23);
        people.put("Мария", 24);
        people.put("Сергей", 30);
        people.put("Ольга", 18);

        for (Map.Entry<String, Integer> entry : people.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

//put(key, value) — добавляет пару в мапу.
//entrySet() — возвращает набор всех пар (ключ + значение)
//getKey() и getValue() — получение ключа и значения у пары.