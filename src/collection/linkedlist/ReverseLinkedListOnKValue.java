package collection.linkedlist;

import java.util.Scanner;
import java.util.Stack;

public class ReverseLinkedListOnKValue {
    private static Node reverseKGroup(Node head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        Stack<Node> stack = new Stack<Node>();
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            int count = 0;
            while (curr != null && count < k) {
                stack.push(curr);
                curr = curr.next;
                count++;
            }
            while (!stack.isEmpty()) {
                if (prev == null) {
                    prev = stack.pop();
                    head = prev;
                } else {
                    prev.next = stack.pop();
                    prev = prev.next;
                }
            }
        }
        prev.next = null;
        return head;

    }

    static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter k number");
        int k = sc.nextInt();
        head = reverseKGroup(head, k);
        print(head);
    }
}
