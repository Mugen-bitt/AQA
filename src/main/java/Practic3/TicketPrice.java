package Practic3;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня недели (1-7): ");
        int day = scanner.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Стоимость билета: 300 р.");
                break;
            case 6:
            case 7:
                System.out.println("Стоимость билета: 450 р.");
                break;
            default:
                System.out.println("Ошибка: введите число от 1 до 7");
        }
        scanner.close();


    }






}
