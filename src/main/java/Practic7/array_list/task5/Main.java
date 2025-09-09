package Practic7.array_list.task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(34);
        numbers.add(23);
        numbers.add(12);
        numbers.add(3);

        int max = numbers.get(0);

        for (Integer number : numbers){
            if (number > max){
                max = number;
            }
        }
        System.out.println("Максимальное число: " + max);

    }
}
