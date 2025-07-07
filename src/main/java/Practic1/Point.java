package Practic1;

public class Point {
    private int x;
    private int y;

    //Конструктор
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Геттер для получения значения координат X
    public int getX(){
        return x;
    }
    //Геттер для получения значения координат Y
    public int getY(){
        return y;
    }
    //Сеттер для изменения значения Х
    public void setX(int x){
        this.x = x;
    }
    //Метод print
    public void print(){
        System.out.println("Координаты: х = " + x + ", y = " + y);
    }


    //Метод main
    public static void main(String[] args){
        Point point = new Point(5,10);
        point.print();
        point.setX(7);
        point.print();
    }
}
