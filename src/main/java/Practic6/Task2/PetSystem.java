package Practic6.Task2;

import java.io.Console;

public class PetSystem {
    public static Console out;
    private Pet pet;

    public void addPet(Pet pet){
        this.pet = pet;
        System.out.println("Лог: Добавили животное");
    }
    public void feedPet(){
        this.pet.eat();
        System.out.println("Лог: Покормили животное");
    }
    public void forcePetToPlay(){
        if (this.pet instanceof Playable){
            Playable playablePet = (Playable) this.pet;
            playablePet.play();
        } else {
            System.out.println("Ошибка: Животное не играет!");
        }
    }
    public void forcePetToWalk(){
        if (this.pet instanceof Walkable){
            Walkable walkable = (Walkable) this.pet;
            walkable.walk();
        }else {
            System.out.println("Ошибка: Животное не гуляет!");
        }
    }
}
