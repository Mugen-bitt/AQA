package Practic4;

import java.util.Scanner;

public class TestScoreEvaluator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите результат теста (0-100): ");
        int score = scanner.nextByte();

        if (score >= 90){
            System.out.println("Отлично");
        } else if (score >=75 ){
            System.out.println("Хорошо");
        } else if (score >= 60){
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
        scanner.close();


    }


}
