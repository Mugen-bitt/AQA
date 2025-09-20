package Practic9.functioninterfacelambda.Task1;

public class Main1 {
    static void main(String[] args) {
        MathOperation add = ((a, b) -> a + b);
        MathOperation sub = ((a, b) -> a - b);
        MathOperation multiply = ((a, b) -> a * b);
        MathOperation divide = ((a, b) -> a / b);

        System.out.println(add.operate(10, 5));
        System.out.println(sub.operate(10, 5));
        System.out.println(multiply.operate(10, 5));
        System.out.println(divide.operate(10, 5));
    }
}
