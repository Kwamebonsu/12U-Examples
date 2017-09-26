/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.examples;

import java.util.Arrays;

/**
 *
 * @author bonsk5852
 */
public class SortingSearching {

    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void selection(int[] array) {
        // Keep track of which position we are sorting
        for (int position = 0; position < array.length; position++) {
            // go through the rest looking for a smaller number
            for (int i = position + 1; i < array.length; i++) {
                // Have we found smaller?
                if (array[i] < array[position]) {
                    // Swap numbers
                    swap(array, i, position);
                }
            }
        }
    }

    public void bubble(int[] array) {
        // keep track of end
        int last = array.length;

        // boolean to flag a swap
        boolean swap = true;

        // Continue if a swap has been made
        while (swap) {
            // Assume swaps will be done
            swap = false;
            // look for swaps
            for (int i = 0; i < last - 1; i++) {
                // find a bigger value?
                if (array[i] > array[i + 1]) {
                    // swap
                    swap(array, i, i + 1);
                    swap = true;
                }
            }
            // move the last position tracker
            last--;
        }
    }

    public void insertion(int[] array) {
        // Start going through the array
        for (int i = 0; i < array.length - 1; i++) {
            // Store position
            int position = i;
            // Check values beside each other
            while (position >= 0 && array[position] > array[position + 1]) {
                // If out of place, swap it downwards until correct position is reached
                swap(array, position, position + 1);
                position--;
            }
        }

    }

    public void merge(int[] array) {
        // If we are 1 item, done sorting
        if (array.length <= 1) {
            return;
        }
        // divide into 2 arrays
        int split = array.length / 2;
        // create 2 arrays
        int[] front = Arrays.copyOfRange(array, 0, split);
        int[] back = Arrays.copyOfRange(array, split, array.length);

        // recursively sort
        merge(front);
        merge(back);

        // put numbers in the right position
        // keeping track of where we are
        int fSpot = 0;
        int bSpot = 0;
        for (int i = 0; i < array.length; i++) {
            // no more items in front
            if (fSpot == front.length) {
                // put item from back array in
                array[i] = back[bSpot];
                bSpot++;
            } else if (bSpot == back.length) {
                // put item from front array in
                array[i] = front[fSpot];
                fSpot++;
            } else if (front[fSpot] < back[bSpot]) {
                // put front item in
                array[i] = front[fSpot];
                fSpot++;
            } else {
                // put back item in
                array[i] = back[bSpot];
                bSpot++;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SortingSearching test = new SortingSearching();

        // Create an array of ints
        int[] numbers = new int[10];

        // Fill the array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }

        // Output the numbers in the array
        System.out.println("BEFORE:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }



        // Test the selection method
        test.merge(numbers);
        System.out.println("");
        System.out.println("");



        // Output the sorted array
        System.out.println("After:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
