package Practic10.Task3;

public class VolatileExample {
    private static volatile boolean stop = false;
    public static void main(String[] args){
        Thread counterThread = new Thread(() -> {
            int counter = 0;
            while (!stop) {
                counter++;
            }
            System.out.println("Поток завершен. Итоговое значение: " + counter);
        });
        counterThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop = true;
    }
}
