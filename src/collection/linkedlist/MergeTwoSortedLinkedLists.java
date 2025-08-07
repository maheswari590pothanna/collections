package collection.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLinkedLists {

    private static Node sortedMerge(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.data <= head2.data) {
            head1.next = sortedMerge(head1.next, head2);
            return head1;
        } else {
            head2.next = sortedMerge(head1, head2.next);
            return head2;
        }
    }

    static void printList(Node curr) {
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(2);
        head1.next = new Node(3);
        head1.next.next = new Node(4);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(7);

        Node res = sortedMerge(head1, head2);
        printList(res);
    }
}
