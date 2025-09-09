package Practic6.Task5;

class Farm {
    private FarmAnimal animal;

    public void addAnimal(FarmAnimal animal){
        this.animal = animal;
        System.out.println("Животное добавлено на ферму.");
    }
    public void careAnimal(){
        if (animal != null){
            animal.care();
        } else {
            System.out.println("На ферме пока нет животных.");
        }
    }
    public void getProduction(){
        if (animal != null){
            animal.produce();
        } else {
            System.out.println("На ферме пока нет животных.");
        }
    }
}
