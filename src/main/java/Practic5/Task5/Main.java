package Practic5.Task5;

public class Main {
    public static void main(String[] args){
        Farm farm = new Farm();

        farm.addAnimal(new Cow());
        farm.careAnimal();
        farm.getProduction();

        farm.addAnimal(new Chicken());
        farm.careAnimal();
        farm.getProduction();
    }
}
