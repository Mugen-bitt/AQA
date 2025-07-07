package Practic4;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        switch (operator){
            case "+":
                System.out.println("Результат: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Результат: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Результат: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("Ошибка: нельзя делить на ноль.");
                } else {
                    System.out.println("Результат: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Ошибка: неправильный ввод.");
        }
    scanner.close();

    }

}
