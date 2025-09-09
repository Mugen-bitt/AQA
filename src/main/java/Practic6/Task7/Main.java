package Practic6.Task7;

public class Main {
    public static void main(String[] args){
        Park park = new Park();

        park.addAttraction(new RollerCoaster());
        park.serviceAttraction();
        park.checkAttraction();

        park.addAttraction(new Carousel());
        park.serviceAttraction();
        park.checkAttraction();
    }
}
