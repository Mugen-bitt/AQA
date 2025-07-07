package Practic4;
import java.util.Scanner;
public class ExitCommand {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Введите команду (для выхода напишите 'exit'): ");
            input = scanner.nextLine();
        } while (!input.equals("exit"));
        System.out.println("Программа завершена.");
        scanner.close();


    }

}
