package Practic8.home_work.exception_task2;

public class Main {
    public static void divide(int a, int b){
        try {
            int result = a / b;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e){
            System.out.println("Ошибка: деление на ноль невозможно.");
        }
    }

    public static void main(String[] args) {
        divide(10, 2);
        divide(10, 0);
    }
}
