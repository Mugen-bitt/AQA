package Practic7.linked_list.task3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> items = new LinkedList<>();

        items.add("Первая");
        items.add("Средняя");
        items.add("Последняя");

        if (!items.isEmpty()){
            String first = items.getFirst();
            String last = items.getLast();
            System.out.println("Первый элемент: " + first);
            System.out.println("Последний элемент: " + last);
        }

    }
}
