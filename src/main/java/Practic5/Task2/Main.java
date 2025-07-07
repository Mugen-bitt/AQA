package Practic5.Task2;

public class Main {
    public static void main(String[] args){
        Dog Sharik = new Dog();
        PetSystem petSystem = new PetSystem();
        petSystem.addPet(Sharik);
        petSystem.feedPet();
        petSystem.forcePetToPlay();
        petSystem.forcePetToWalk();
        petSystem.addPet(new Cat());
        petSystem.feedPet();
        petSystem.forcePetToPlay();
        petSystem.forcePetToWalk();
    }
}
