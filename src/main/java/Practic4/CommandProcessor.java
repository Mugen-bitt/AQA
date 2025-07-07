package Practic4;

import java.util.Scanner;
public class CommandProcessor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду (start, stop,restart или status): ");
        String command = scanner.nextLine();

        switch (command){
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезапускается");
                break;
            case "status":
                System.out.println("Система работает нормально");
                break;
            default:
                System.out.println("Неизвестная команда");
        }

        scanner.close();
    }


}
