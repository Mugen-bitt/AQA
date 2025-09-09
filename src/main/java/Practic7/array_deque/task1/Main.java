package Practic7.array_deque.task1;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("Первый");
        deque.add("Второй");
        deque.add("Третий");
        deque.add("Четвертый");
        deque.add("Пятый");

        for (String element : deque){
            System.out.println(element);
        }
    }
}
