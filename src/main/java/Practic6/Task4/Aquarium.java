package Practic6.Task4;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addSeaCreature (SeaCreature creature){
        this.seaCreature = creature;
        System.out.println("Лог: Морское существо добавлено");
    }
    public void demonstrate(){
        if (seaCreature == null){
            System.out.println("В аквариуме пока нет существ");
            return;
        }
        seaCreature.showBehavior();
        System.out.println("Демонстация завершена");
    }
}
