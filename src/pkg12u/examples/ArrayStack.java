/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.examples;

/**
 *
 * @author bonsk5852
 */
public class ArrayStack {
// Store all the integers on the stack

    private int[] stack;
    // keep track of how many items
    private int numItems;

    // Constructor
    public ArrayStack() {
        stack = new int[10];
        numItems = 0;
    }

    // Add an item to the stack
    public void push(int item) {
        if (numItems < stack.length) {
            // put the item on the stack
            stack[numItems] = item;
            numItems++;
        } else {
            // make more room in the stack
            int[] temp = new int[stack.length * 2];
            // Copy items over
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            // stack becomes the new array
            stack = temp;
            // add item
            stack[numItems] = item;
            numItems++;
        }
    }
    // Remove an item from the stack

    public int pop() {
        // Get the top item on the stack Last-In-First-Out
        int item = stack[numItems];
        numItems--;
        // give back item
        return item;
    }
    // Get the size

    public int size() {
        return numItems;
    }
    // Look at the top item

    public int peek() {
        return stack[numItems - 1];
    }
    // Check if the array is empty

    public boolean isEmpty() {
        return numItems == 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an empty array stack
        ArrayStack stack = new ArrayStack();
        System.out.println("Empty: " + stack.isEmpty());
        stack.push(12);
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Popped item " + stack.pop());
        System.out.println("Empty: " + stack.isEmpty());

        // Test adding lots of items
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }
        System.out.println("Size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
    }
}
