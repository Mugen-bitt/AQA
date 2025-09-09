package Practic7.tree_set.task1;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(34);
        numbers.add(6);
        numbers.add(55);
        numbers.add(87);
        numbers.add(9);

        for (Integer number : numbers){
            System.out.println(number);
        }
    }
}
