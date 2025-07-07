package Practic5.Task1;

class Bird extends Animal {
    @Override
    void makeSound(){
        System.out.println("Чирикает");
    }
    @Override
    void makeMove(){
        System.out.println("Летает");
    }
}