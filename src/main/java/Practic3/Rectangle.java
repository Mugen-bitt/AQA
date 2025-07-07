package Practic3;

public class Rectangle {
    private int width;
    private int height;

    //Конструктор
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    //Геттер для получения ширины
    public int getWidth(){
        return width;
    }
    //Геттер для получения высоты
    public int getHeight(){
        return height;
    }
    //Сеттер для изменения ширины
    public void setWidth(int width){
        this.width = width;
    }
    //Метод calculateArea() для показа площади
    public int calculateArea(){
        return width * height;
    }
    //Метод main
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(5,7);
        System.out.println("Площадь: " + rectangle.calculateArea());
        rectangle.setWidth(10);
        System.out.println("Новая площадь: " + rectangle.calculateArea());


    }






}