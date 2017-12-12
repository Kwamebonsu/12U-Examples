/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

/**
 *
 * @author bonsk5852
 */
public class Cat extends Pet {

    private int livesRemaining;

    public Cat(String name, int age, String breed, String colour) {
        super(name, age, breed, colour);
        livesRemaining = 9;
    }

    @Override
    public void speak() {
        System.out.println("MEOW MEOW");
    }

    @Override
    public String toString() {
        String fromPet = super.toString();
        fromPet += "\nLives: " + livesRemaining;
        fromPet += "\nType: Cat";
        return fromPet;
    }
}
