package Practic8.home_work.exception_task4;

public class Main {
    public static void main(String[] args) {
        String email = "user.example.com";

        try {
            EmailValidator.validate(email);
            System.out.println("Email корректный.");
        } catch (InvalidEmailException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
