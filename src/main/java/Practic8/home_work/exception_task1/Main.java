package Practic8.home_work.exception_task1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
           System.out.println("Файл не найден");
        }
    }
}
