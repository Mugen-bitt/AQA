package Practic8.errors;

public class StackOverflowError {
    public static void recursivePrint(int num) {
        System.out.println(num);
        recursivePrint(num + 1);

    }

    public static void main(String[] args) {
        recursivePrint(1);
    }
}
// Рекурсивное печатание