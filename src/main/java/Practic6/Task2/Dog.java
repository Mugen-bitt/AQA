package Practic6.Task2;

public class Dog extends Pet implements Walkable {
    @Override
    void eat(){
        System.out.println("Собака есть сухой корм");
    }
    @Override
    public void walk(){
        System.out.println("Собака гуляет");
    }
}
