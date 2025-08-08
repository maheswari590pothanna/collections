package collection.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveQueue {
    public static void interleave(Queue<Integer> queue) {
        int n = queue.size();
        if (n % 2 != 0) {
            throw new IllegalArgumentException("Queue size must be even");
        }

        Stack<Integer> stack = new Stack<>();
        int half = n / 2;
        for (int i = 0; i < half; i++) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        for (int i = 0; i < half; i++) {
            queue.offer(queue.poll());
        }
        for (int i = 0; i < half; i++) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
            queue.offer(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 6; i++) {
            queue.offer(i);
        }
        System.out.println("Original queue: " + queue);
        interleave(queue);
        System.out.println("Interleaved queue: " + queue);
    }
}


