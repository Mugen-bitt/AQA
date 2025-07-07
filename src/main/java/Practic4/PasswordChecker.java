package Practic4;
import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final String correctPassword = "12345";
        String input;

        do {
            System.out.println("Введите пароль: ");
            input = scanner.nextLine();
        } while (!input.equals(correctPassword));
        System.out.println("Доступ разрешен.");
        scanner.close();


    }
}
