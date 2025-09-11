package Practic8.home_work.exception_task3;

import static Practic8.home_work.exception_task3.AgeValidator.checkAge;

public class Main {
    public static void main(String[] args) {
        try {
            checkAge(25);
            checkAge(155);
        } catch (InvalidAgeException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
