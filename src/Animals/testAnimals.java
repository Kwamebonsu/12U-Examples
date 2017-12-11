/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

/**
 *
 * @author bonsk5852
 */
public class testAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog fido = new Dog("Fido", 3, "Boston Terrier", "Black and White");
        Cat whiskers = new Cat("Whiskers", 5, "Tabby", "Brown Stripe");
        fido.speak();
        whiskers.speak();
        
        System.out.println(fido);
        System.out.println(whiskers);
    }
}
