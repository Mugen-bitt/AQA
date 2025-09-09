package Practic7.linked_list.task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Сделать домашку");
        tasks.add("Позвонить другу");
        tasks.add("Выгулять собаку");

        while (!tasks.isEmpty()){
            String currentTask = tasks.poll();

            System.out.println("Задача обрабатывается: " + currentTask);
        }

    }
}
