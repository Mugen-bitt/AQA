package Practic1;

public class Laptop {
    private String brand;
    private double price;

    //Конструктор
    public Laptop(String brand, double price){
        this.brand = brand;
        this.price = Math.max(price, 0);
    }
    //Геттер для получения бренда
    public String getBrand(){
        return brand;
    }
    //Геттер для получения цены
    public double getPrice(){
        return price;
    }
    //Сеттер для изменения бренда
    public void setBrand(String brand){
        this.brand = brand;
    }
    //Сеттер для изменения цены
    public void setPrice(double price){
        this.price = Math.max(price, 0);
    }
    //Метод printInfo
    public void printInfo(){
        System.out.println("Ноутбук: " + brand + ", Цена: " + price + " руб.");
    }
    //Метод main
    public static void main(String[] args){
        Laptop laptop = new Laptop("Lenovo", 70000.0);
        laptop.printInfo();
        laptop.setPrice(25000);
        laptop.printInfo();
    }
}
