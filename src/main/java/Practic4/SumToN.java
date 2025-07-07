package Practic4;
import java.util.Scanner;
public class SumToN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum +=1;
        }
        System.out.println("Сумма чисел от 1 до " + n + ": " + sum);
        scanner.close();




    }

}
