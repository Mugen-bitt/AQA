package Practic6.Task8;

class Sculpture extends Exhibit {
    @Override
    void showHistory(){
        System.out.println("Скульптура создана великим мастером эпохи Возрождения.");
    }
    @Override
    void storageConditions(){
        System.out.println("Скульптура требует регулярной реставрации.");
    }
}
