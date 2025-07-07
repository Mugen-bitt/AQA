package Practic4;
import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();
        int result = 1;
        int i = 1;
        while (i <= number){
            result *= i; i++;
        }
        System.out.println("Факториал числа " + number + " равен " + result);
        scanner.close();
    }

}
