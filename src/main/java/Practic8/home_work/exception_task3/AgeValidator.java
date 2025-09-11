package Practic8.home_work.exception_task3;

public class AgeValidator {
    public static void checkAge(int age) throws InvalidAgeException{
        if (age < 0 || age > 150){
            throw new InvalidAgeException("Недопустимый возраст: " + age);
        } else {
            System.out.println("Возраст корректен: " + age);
        }
    }
}
