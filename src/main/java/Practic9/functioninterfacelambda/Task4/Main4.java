package Practic9.functioninterfacelambda.Task4;

import java.util.function.Function;

public class Main4 {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println("Длина 'Привет!': " + lengthFunction.apply("Привет"));
        System.out.println("Длина 'Здравствуйте!': " + lengthFunction.apply("Здравствуйте"));
    }
}
