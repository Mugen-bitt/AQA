package Practic4;
import java.util.Scanner;
public class PositiveNumberPrinter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите число (0 для выхода): ");
            int number = scanner.nextInt();
            if (number == 0){
                break;
            }
            if (number < 0){
                continue;
            }
            System.out.println("Положительное число: " + number);


        }
        scanner.close();


    }
}
