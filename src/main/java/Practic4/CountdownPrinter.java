package Practic4;
import java.util.Scanner;
public class CountdownPrinter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int number = scanner.nextInt();

        while (number >= 1){
            System.out.println(number);
            number--;
        }
        scanner.close();



    }
}
