package Practic8.home_work.generics_task1;

public class Box<T> {
    private T item;

    public void set(T item){
        this.item = item;
    }

    public T get(){
        return item;
    }
}
