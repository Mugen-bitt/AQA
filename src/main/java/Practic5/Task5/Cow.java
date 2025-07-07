package Practic5.Task5;

class Cow extends FarmAnimal {
    @Override
    void care(){
        System.out.println("Корова нуждается в выпасе.");
    }
    @Override
    void produce(){
        System.out.println("Корова дает молоко.");
    }
}
