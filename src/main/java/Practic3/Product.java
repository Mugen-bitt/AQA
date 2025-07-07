package Practic3;

public class Product {
    private String name;
    private double price;

    //Конструктор
    public Product(String name, double price){
        this.name = name;
        this.price = Math.max(price, 0);
    }
    //Геттер для получения названия товара
    public  String getName(){
        return name;
    }
    //Геттер для получения цены
    public double getPrice(){
        return price;
    }
    //Сеттер дл изменения цены
    public void setPrice(double price){
        this.price = Math.max(price, 0);
    }
    //Метод applyDiscount(double discount) для уменьшения цены
    public void applyDiscount(double discount){
        price *= (1 - discount/100);
    }
    //Метод printInfo() для вывода
    public void printInfo(){
        System.out.println("Товар: " + name + ", Цена: " + price + "руб.");
    }
    //Метод main
    public static void main(String[] args){
        Product product = new Product("Хлеб", 50);
        product.printInfo();
        product.setPrice(70);
        product.printInfo();
        product.applyDiscount(7);
        product.printInfo();




    }


}
