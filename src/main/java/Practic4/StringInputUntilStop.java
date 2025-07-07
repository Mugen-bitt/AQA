package Practic4;
import java.util.Scanner;
public class StringInputUntilStop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите строку (для завершения введите 'stop'): ");
            String input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            }
            System.out.println("Вы ввели: " + input);
        }
        System.out.println("Программа завершена.");
        scanner.close();


    }
}
