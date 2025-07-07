package Practic5.Task5;

class Chicken extends FarmAnimal {
    @Override
    void care(){
        System.out.println("Курица требует корм с зерном.");
    }
    @Override
    void produce(){
        System.out.println("Курица несет яйца.");
    }
}
