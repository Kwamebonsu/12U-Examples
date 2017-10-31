/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.examples;

/**
 *
 * @author bonsk5852
 */
public class MyLinkedList {
    
    private IntNode head;
    private int numItems;
    
    public MyLinkedList() {
        head = null;
        numItems = 0;
    }
    
    public void add(int num) {
        // Start at beginning of list
        IntNode node = head;
        // see if we are at the first item
        if (node == null) {
            IntNode temp = new IntNode(num);
            head = temp;
        } else {
            // travel to the end
            while (node.getNext() != null) {
                // travel to the next spot until there is no next spot
                node = node.getNext();
            }
            // node is the last node in the list
            IntNode temp = new IntNode(num);
            // insert it into the list
            node.setNext(temp);
        }
        numItems++;
    }
    
    public void add(int pos, int num) {
        // at the front
        if (pos == 0) {
            // create the node
            IntNode temp = new IntNode(num);
            // the new node points to the start
            temp.setNext(head);
            // reassign the head node
            head = temp;
            // increase the item counter
            numItems++;
            // Adding at the end of the list
        } else if (pos == numItems) {
            add(num);
            // anywhere else
        } else {
            // start at the beginning
            IntNode node = head;
            // move to the node before the insert
            for (int i = 0; i < pos - 1; i++) {
                node = node.getNext();
            }
            // @ node just before insert
            IntNode temp = new IntNode(num);
            // create the after link first
            temp.setNext(node.getNext());
            // change node pointer
            node.setNext(temp);
            // increase the item counter
            numItems++;
        }
    }
    
    public int size() {
        return numItems;
    }
    
    public boolean isEmpty() {
        return numItems == 0;
    }
    
    public int get(int position) {
        IntNode node = head;
        // move the number of time
        for (int i = 0; i < position; i++) {
            node = node.getNext();
        }
        // Return the number at that position
        return node.getNum();
    }
    
    public void remove(int pos) {
        // removing from the start of the list
        if (pos == 0) {
            head = head.getNext();
        } else if (pos == numItems - 1) {
            // removing from the end
            IntNode node = head;
            // moving to the second last item
            for (int i = 0; i < numItems - 1; i++) {
                node = node.getNext();
            }
            // sever the link betweem the last 2 numbers
            node.setNext(null);
        } else {
            IntNode node = head;
            // move to the spot just before
            for (int i = 0; i < pos - 1; i++) {
                node = node.getNext();
            }
            // the node to remove
            IntNode toRemove = node.getNext();
            // its next node
            IntNode next = toRemove.getNext();
            // set all the links
            node.setNext(next);
            toRemove.setNext(null);
        }
        numItems--;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Linked list
        MyLinkedList list = new MyLinkedList();
        list.add(2);
        list.add(-5);
        list.add(1, 13);
        list.add(0, 8);
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
