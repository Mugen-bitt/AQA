package Practic7.hash_map.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();

        people.put("Павел", 34);
        people.put("Василий", 30);
        people.put("Игорь", 25);
        people.put("Арсен", 45);
        people.put("Петр", 38);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя поиска: ");
        String name = scanner.nextLine();

        if (people.containsKey(name)){
            System.out.println("Найдено! Возраст: " + people.get(name));
        } else {
            System.out.println("Такого имени нет в списке.");
        }
    }
}
