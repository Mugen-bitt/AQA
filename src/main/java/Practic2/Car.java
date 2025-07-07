package Practic2;

public class Car {

    private String brand;
    private int year;

    //Конструктор
    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    //геттер для получения марки
    public  String getBrand(){
        return brand;
    }
    //сеттер для изменения марки
    public void setBrand(String brand){
        this.brand = brand;
    }
    //Геттер для получения года выпуска
    public int getYear(){
        return year;
    }
    //Сеттер для изменения года выпуска
    public void setYear(int year){
        this.year = year;
    }
    //Метод принт для вывода инфы
    public void print(){
        System.out.println("Марка: " + brand + ", Год выпуска: " + year);
    }

    //метод main
    public static void main(String[] args){
        Car myCar = new Car("Toyota", 2015);
        myCar.print();
        myCar.setYear(2021);
        myCar.print();
    }

}









