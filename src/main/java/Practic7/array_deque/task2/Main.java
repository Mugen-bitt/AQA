package Practic7.array_deque.task2;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("Первый");
        stack.push("Второй");
        stack.push("Третий");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
