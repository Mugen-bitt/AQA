package Practic4;

import java.util.Scanner;
public class EvenNumbersPrinter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        scanner.close();

    }

}
