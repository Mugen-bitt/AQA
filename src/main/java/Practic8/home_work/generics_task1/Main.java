package Practic8.home_work.generics_task1;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Привет, мир!");
        System.out.println("String из коробки: " + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(50);
        System.out.println("Integer из коробки: " + intBox.get());
    }
}
