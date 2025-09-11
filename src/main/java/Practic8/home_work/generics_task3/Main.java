package Practic8.home_work.generics_task3;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> person = new Pair<>("Павел", 34);

        System.out.println("Имя: " + person.getFirst());
        System.out.println("Возраст: " + person.getSecond());

        person.setFirst("Иван");
        person.setSecond(30);

        System.out.println("Новое имя: " + person.getFirst());
        System.out.println("Новый возраст: " + person.getSecond());
    }
}
