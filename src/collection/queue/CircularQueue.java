package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CircularQueue {
    int[] ar;
    int front;
    int rear;
    int size;
    int capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        ar = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }
    void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Overflow");
        }else{
            rear=[rear+1]%capacity;
            ar[rear]=value;
            size++;
        }
    }
    int dequeue() {
        if (size == 0) {
            System.out.println("Underflow");
            return -1;
            return element;
        }
    }
    int getFront() {
        if(size>0){
            return ar[front];
        }else{
            System.out.println("Underflow");
            return -1;
        }
    }
    int getRear() {
        if(size>0){
            return ar[rear];
        }
        else{
            System.out.println("Underflow");
        }
    }
    boolean isFull(){
        return size==capacity;
    }
    boolean  isEmpty(){
        return size==0;
    }
    int size(){
        return size;
    }
}
public static void main(String[] args){
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);


}
