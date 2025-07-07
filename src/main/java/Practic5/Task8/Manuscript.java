package Practic5.Task8;

class Manuscript extends Exhibit {
    @Override
    void showHistory(){
        System.out.println("Древний манускрипт написан в древности и хранит исторические тайны.");
    }
    @Override
    void storageConditions(){
        System.out.println("Манускрипт нуждается в контроле температуры и влажности.");
    }
}
