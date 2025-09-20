package Practic9.functioninterfacelambda.Task5;

import java.util.function.Consumer;

public class Main5 {
    public static void main(String[] args) {
        Consumer<String> printString = str -> System.out.println(str);
        printString.accept("Привет от Консьюмера!");
        printString.accept("Привет от Java!");
    }
}
