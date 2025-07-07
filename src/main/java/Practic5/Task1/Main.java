package Practic5.Task1;

class Main {
    public static void main(String[] args){
        Zoo zoo = new Zoo();

        Bird Strizh = new Bird();

        zoo.addAnimal(Strizh);
        zoo.forceMakeSound();
        zoo.forceMakeMove();

        Elephant elephant = new Elephant();
        zoo.removeAnimal();
        zoo.addAnimal(elephant);
        zoo.forceMakeSound();
        zoo.forceMakeMove();
    }
}
