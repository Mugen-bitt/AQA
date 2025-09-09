package Practic7.priority_queue.task1;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(20);
        queue.add(10);
        queue.add(50);
        queue.add(70);
        queue.add(90);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
