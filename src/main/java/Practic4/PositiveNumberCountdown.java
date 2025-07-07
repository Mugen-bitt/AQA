package Practic4;
import java.util.Scanner;
public class PositiveNumberCountdown {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите положительное число: ");
            number = scanner.nextInt();
        } while (number <= 0);
        while (number >= 1){
            System.out.println(number);
            number--;
        }
        scanner.close();




    }

}
