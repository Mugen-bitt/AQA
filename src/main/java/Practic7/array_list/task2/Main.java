package Practic7.array_list.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(6);
        numbers.add(4);
        numbers.add(8);
        numbers.add(9);

        for (Integer number : numbers){
            if (number % 2 == 0){
                System.out.println(number);
            }
        }
    }
}


//Объявляем цикл for-each, чтобы пройти по всем элементам списка numbers.
//Integer number — это переменная, которая будет поочерёдно принимать значение каждого элемента из списка.
//В теле цикла пишем условие: if (number % 2 == 0) — проверяем, делится ли число на 2 без остатка. Это значит, что число чётное.
//Если условие выполняется, то System.out.println(number); — выводим чётное число в консоль.