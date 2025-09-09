package Practic7.hash_set.task2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(66);
        numbers.add(6);
        numbers.add(9);
        numbers.add(7);
        numbers.add(4);
        numbers.add(12);
        numbers.add(22);

        int target = 33;

        if (numbers.contains(target)){
            System.out.println("Число " + target + " найдено в HashSet.");
        } else {
            System.out.println("Число " + target + " не найдено в HashSet.");
        }
    }
}
