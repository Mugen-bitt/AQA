package Practic6.Task2;

public class Cat extends Pet implements Playable {
    @Override
    void eat(){
        System.out.println("Кошка есть влажный корм");
    }
    @Override
    public void walk(){

    }
    @Override
    public void play(){
        System.out.println("Кошка играет с мышкой");
    }
}
