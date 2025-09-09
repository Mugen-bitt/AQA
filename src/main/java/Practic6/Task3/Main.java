package Practic6.Task3;

public class Main {
    public static void main(String[] args){
        MainCourse steak = new MainCourse(180);
        RestMenu menu = new RestMenu();
        menu.addDish(steak);
        menu.showCharacteristics();

        Drink Moxito = new Drink(250);
        menu.addDish(Moxito);
        menu.showCharacteristics();
    }
}
