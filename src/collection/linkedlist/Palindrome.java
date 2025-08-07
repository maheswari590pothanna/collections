package collection.linkedlist;

import java.util.Stack;

public class Palindrome {

    private static boolean isPalindrome(Node head) {
        Node curr = head;
        Stack<Integer> s = new Stack<>();
        while (curr != null) {
            s.push(curr.data);
            curr = curr.next;
        }
        while (head != null) {
            if (head.data != s.pop())
                return false;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        if (isPalindrome(head))
            System.out.println("given linked list is palindrome");
        else
            System.out.println("given linked list is not palindrome");
    }
}