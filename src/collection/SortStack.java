package collection;

import java.util.Scanner;
import java.util.Stack;

public class SortStack {

    public static void sortStack(Stack<Integer> stack) {
        if(stack.isEmpty())
            return;
       int temp= stack.pop();
       sortStack(stack);
       insertAtCorrectPosition(stack,temp);
    }
    public static void insertAtCorrectPosition(Stack<Integer> stack,int temp) {
       if(stack.isEmpty()||stack.peek()<temp) {
           stack.push(temp);
           return;
       }
       int topele=stack.pop();
       insertAtCorrectPosition(stack,topele);
       stack.push(temp);
    }
    public static void display(Stack<Integer> stack) {
        if(stack.isEmpty())
            return;
        while(!stack.isEmpty())
        {
            int temp=stack.pop();
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println("enter the elementsinto the stack:");
        Scanner sc=new Scanner(System.in);
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        display(stack);
        sortStack(stack);
        display(stack);
    }
}
