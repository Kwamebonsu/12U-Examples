/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.examples;

/**
 *
 * @author bonsk5852
 */
public class MyQueue {

    // Instance variables
    private int numItems;
    private IntNode head;
    private IntNode tail;

    // Constructor
    public MyQueue() {
        numItems = 0;
        head = null;
        tail = null;
    }
    // Get size of queue

    public int size() {
        return numItems;
    }
    // Is the queue empty?

    public boolean isEmpty() {
        return numItems == 0;
    }
    // Peek at the first object in the queue

    public int peek() {
        return head.getNum();
    }

    public void enqueue(int item) {
        // If there is nothing in the queue, set the item to head and tail
        if (isEmpty()) {
            IntNode temp = new IntNode(item);
            head = temp;
            tail = temp;
        } else {
            // If there is something in the queue, add item to the end
            IntNode temp = new IntNode(item);
            tail.setNext(temp);
            tail = temp;
        }
        numItems++;
    }

    public int dequeue() {
        // If there is only 1 item in the queue
        if (numItems == 1) {
            // get the item
            int item = head.getNum();
            // remove it from the queue
            head = null;
            tail = null;
            numItems--;
            // return the item
            return item;
        } else {
            // get the item
            int item = tail.getNum();
            // sever the link
            IntNode old = head;
            head = head.getNext();
            old.setNext(null);
            // remove it from the 
            numItems--;
            // return the item
            return item;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a queue
        MyQueue q = new MyQueue();
        System.out.println("Empty: " + q.isEmpty());
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(-6);
        System.out.println("Size: " + q.size());
        System.out.println("Peek " + q.peek());
        q.dequeue();
        System.out.println("Size: " + q.size());
        System.out.println("Empty: " + q.isEmpty());
    }
}
