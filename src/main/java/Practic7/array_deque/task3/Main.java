package Practic7.array_deque.task3;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("Начало");
        deque.addLast("Середина");
        deque.addLast("Конец");

        System.out.println("Удалено с начала: " + deque.removeFirst());
        System.out.println("Удалено с конца: " + deque.removeLast());
        System.out.println("Что осталось: " + deque);
    }
}
