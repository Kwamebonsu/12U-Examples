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
        Pet spike = new Dog("Spike", 8, "Bulldog", "Brown");

        fido.speak();
        whiskers.speak();

        System.out.println(fido);
        System.out.println(whiskers);
        Pet[] p = new Pet[3];
        p[0] = fido;
        p[1] = whiskers;
        p[2] = spike;
        for (int i = 0; i < 3; i++) {
            System.out.println(p[i]);
            if (p[i] instanceof Dog) {
                Dog tempDog = (Dog) p[i];
                tempDog.howl();
            } else {
                p[i].speak();
            }
        }
    }
}
