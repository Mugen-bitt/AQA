package Practic4;
import java.util.Scanner;
public class DigitCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        int count = 0;
        if (number == 0){
            count = 1;
        } else {
            number = Math.abs(number);

            do {
                number = number / 10;
                count++;
            } while (number != 0);
        }
        System.out.println("Количество цифр: " + count);
        scanner.close();



    }
}
