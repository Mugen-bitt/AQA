package Practic6.Task6;

class BotanGarden {
    private Plant plant;

    public void addPlant(Plant plant){
        this.plant = plant;
        System.out.println("Растение добавлено в ботанический сад.");
    }
    public void provideCare(){
        if (plant != null){
            plant.care();
        }else {
            System.out.println("В ботаническом саду пока нет растений.");
        }
    }
}
