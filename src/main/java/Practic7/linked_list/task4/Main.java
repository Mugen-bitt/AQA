package Practic7.linked_list.task4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;

        for (Integer number : numbers){
            sum += number;
        }

        System.out.println("Сумма всех чисел: " + sum);
    }
}
