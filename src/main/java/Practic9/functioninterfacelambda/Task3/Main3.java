package Practic9.functioninterfacelambda.Task3;

import java.util.function.Predicate;

public class Main3 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("10 четное: " + isEven.test(10));
        System.out.println("5 четное: " + isEven.test(5));
    }
}
