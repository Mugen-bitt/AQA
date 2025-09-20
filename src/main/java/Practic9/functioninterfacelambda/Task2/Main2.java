package Practic9.functioninterfacelambda.Task2;

public class Main2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class");
            }
        };
        runnable.run();
    }
}
