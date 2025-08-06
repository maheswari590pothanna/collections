package collection.stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty())
            return;
        int topelem= stack.pop();
        reverse(stack);
        insertAtBottem(stack,topelem);
    }
    private static void insertAtBottem(Stack<Integer> stack, int topelem) {
        if(stack.isEmpty()){
            stack.push(topelem);
            return;
        }
        int temp=stack.pop();
        insertAtBottem(stack, topelem);
        stack.push(temp);
    }
    public static  void display(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        System.out.println("enter the values:");
        stack.add(sc.nextInt());
        stack.add(sc.nextInt());
        stack.add(sc.nextInt());
        stack.add(sc.nextInt());
        stack.add(sc.nextInt());
        display(stack);
        reverse(stack);
        display(stack);
    }
}
