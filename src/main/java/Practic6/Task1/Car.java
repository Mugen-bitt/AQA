public class Car {
    String model;
    int year;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }
    public void printCar(){
        System.out.println("Модель:" + this.model + ", Год:"+ this.year);
    }
    public void startEngine(){
        System.out.println(this.model + "Запущена");
    }
}