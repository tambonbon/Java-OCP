package Chapter14.implementCollections;

import java.util.LinkedList;
import java.util.Queue;

public class CreateQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.offer(10));
        System.out.println(queue.add(4));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
