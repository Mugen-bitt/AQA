package Practic5.Task4;

public class Main {
    public static void main(String[] args){
        Aquarium aquarium = new Aquarium();
        aquarium.addSeaCreature(new Shark());
        aquarium.demonstrate();

        aquarium.addSeaCreature(new Starfish());
        aquarium.demonstrate();
    }
}
