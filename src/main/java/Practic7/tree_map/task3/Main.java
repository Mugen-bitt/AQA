package Practic7.tree_map.task3;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(100, "Анна");
        employees.put(54, "Игорь");
        employees.put(23, "Павел");
        employees.put(67, "Гоша");
        employees.put(112, "Саша");

        int searchId = 100;

        Integer nextId = employees.higherKey(searchId);

        if (nextId != null){
            System.out.println("Ближайший большой ID: " + nextId);
            System.out.println("Сотрудник: " + employees.get(nextId));
        } else {
            System.out.println("Более высокого ID не найдено.");
        }
    }
}
