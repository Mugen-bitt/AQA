package Practic7.restaurant_manager;

import java.util.LinkedList;

public class RestaurantManager {
    private LinkedList<String> orders;

    public RestaurantManager(){
        this.orders = new LinkedList<>();
    }

    //добавить заказ в конце очереди
    public void addNewOrder(String order){
        orders.addLast(order);
    }

    //обрабатывать заказ из начала очереди
    public String getNextOrderForProcess(){
        return orders.poll();
    }

    //удалять заказ в любом месте очереди
    public void deleteOrder(String order){
        orders.remove(order);
    }

    //метод для отладки
    public void printOrders(){
        System.out.println("Все заказы:");
        orders.forEach(order -> System.out.println(order));
        System.out.println();
    }
}






