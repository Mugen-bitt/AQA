package Practic7.restaurant_manager;
//Задача: разработать систему управления заказами в ресторане.
//Заказы обрабатываются в порядке поступления и в любой момент можно удалить любой заказ

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        manager.addNewOrder("Картошка фри");
        manager.addNewOrder("Спагетти");
        manager.addNewOrder("Маргарита");

        manager.printOrders();
        manager.deleteOrder("Спагетти");
        manager.printOrders();
    }
}
