package Practic2;

public class Circle {
    private  double radius;
    //Конструктор
    public Circle(double radius){
        this.radius = Math.max(radius, 0);
    }
    //Геттер для получения радиуса
    public double getRadius(){
        return radius;
    }
    //Сеттер для изменения радиуса
    public void setRadius(double radius){
        this.radius = Math.max(radius, 0);
    }
    //Метод calculateArea для вычесления площади
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    //Метод calculateCircumference для вычисления окружности
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
    //Метод main
    public static void main(String[] args){
        Circle circle = new Circle(7);
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Длина окружности: " + circle.calculateCircumference());
        circle.setRadius(14);
        System.out.println("Новая площадь: " + circle.calculateArea());
        System.out.println("Новая длина окружности: " + circle.calculateCircumference());


    }




}