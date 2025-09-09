package Practic6.Task6;

public class Main {
    public static void main(String[] args){
        BotanGarden garden = new BotanGarden();

        garden.addPlant(new Orchid());
        garden.provideCare();

        garden.addPlant(new Cactus());
        garden.provideCare();
    }
}
