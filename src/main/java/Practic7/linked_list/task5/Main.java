package Practic7.linked_list.task5;

import java.util.LinkedList; // импортируем LinkedList
import java.util.ListIterator; // импортируем ListIterator для двустороннего прохода по списку

public class Main {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>(); // создаём связанный список строк

        names.add("Анна"); // добавляем строку "Анна"
        names.add("Борис"); // добавляем строку "Борис"
        names.add("Виктор"); // добавляем строку "Виктор"
        names.add("Галина"); // добавляем строку "Галина"

        // Получаем итератор для списка
        ListIterator<String> iterator = names.listIterator(); // создаём итератор

        System.out.println("Прямой проход:");
        while (iterator.hasNext()) { // пока есть следующий элемент
            String name = iterator.next(); // получаем следующий элемент
            System.out.println(name); // выводим его
        }

        System.out.println("\nОбратный проход:");
        while (iterator.hasPrevious()) { // пока есть предыдущий элемент
            String name = iterator.previous(); // получаем предыдущий элемент
            System.out.println(name); // выводим его
        }
    }
}