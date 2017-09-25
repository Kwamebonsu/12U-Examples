/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.examples;

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
    }

    public void insertion(int[] array) {
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
        test.selection(numbers);
        System.out.println("");
        System.out.println("");



        // Output the sorted array
        System.out.println("After:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
