package Practic5.Task3;

public class RestMenu {
    private Dish dish;
    public void addDish(Dish dish){
        this.dish = dish;
        System.out.println("Лог: Блюдо добавлено.");
    }
    public void showCharacteristics(){
        this.dish.showCharacteristics();
        System.out.println("Лог: Характеристики показаны.");
    }
}
