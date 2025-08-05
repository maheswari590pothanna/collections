package collection;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        int min = x;
        if (minStack.isEmpty() && min > minStack.peek()) {
            minStack.push(x);
        }
        stack.push(x);
        minStack.push(min);
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(1);
        minStack.push(4);
        System.out.println(minStack.stack);
        System.out.println(minStack.minStack);
        System.out.println(minStack.getMin());
    }
}
