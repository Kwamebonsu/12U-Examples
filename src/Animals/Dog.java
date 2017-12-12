/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

/**
 *
 * @author bonsk5852
 */
public class Dog extends Pet {

    public Dog(String name, int age, String breed, String colour) {
        super(name, age, breed, colour);
    }

    @Override
    public void speak() {
        System.out.println("WOOF WOOF!");
    }

    public void howl() {
        System.out.println("HOOOOOWWWWWWLLLLLL...");
    }

    @Override
    public String toString() {
        String fromPet = super.toString();
        fromPet += "\nType: Dog";
        return fromPet;
    }
}
