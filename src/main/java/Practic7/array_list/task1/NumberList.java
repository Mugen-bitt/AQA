package Practic7.array_list.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberList {
    private ArrayList<Integer> numbers;

    //Создали список из 5 чисел
    public NumberList(){
        numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    }
    //добавить новое число в конце списка
    public void addNumber(int number){
        numbers.add(number);
    }
    //вывести весь список
    public void printNumbers(){
        for (Integer number : numbers){
            System.out.println(number);
        }
    }
}