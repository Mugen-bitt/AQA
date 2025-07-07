package Practic1;

public class MathConstants {
    public static final double PI = 3.14159;
    public static final double E = 2.71828;

    //метод для вычисления площади круга
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    //Метод для вычисления длины окружности
    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    //Метод main
    public static void main(String[] args) {
        double radius1 = 7;
        double radius2 = 13.0;

        System.out.println("Радиус: " + radius1);
        System.out.println("Площадь круга: " + calculateArea(radius1));
        System.out.println("Длина окружности: " + calculateCircumference(radius1));
        System.out.println("Радиус: " + radius2);
        System.out.println("Площадь круга: " + calculateArea(radius2));
        System.out.println("Длина окружности: " + calculateCircumference(radius2));
    }
}