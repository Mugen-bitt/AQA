package Practic7.linked_list.task1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Павел");
        names.add("Мария");
        names.add("Катя");
        names.add("Ольга");
        names.add("Гоша");

        for (String name : names){
            System.out.println(name);
        }

    }
}
