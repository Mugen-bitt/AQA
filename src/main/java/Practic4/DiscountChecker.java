package Practic4;

import java.util.Scanner;

public class DiscountChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        if (age < 18){
            System.out.println("Ваша скидка: 25%");
        } else if (age >= 65){
            System.out.println("Ваша скидка: 30%");
        } else {
            System.out.println("Скидка не предусмотрена");
        }
        scanner.close();


    }

}
