/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

/**
 *
 * @author bonsk5852
 */
public abstract class Pet {

    private String name;
    private int age;
    private String breed;
    private String colour;

    public Pet(String name, int age, String breed, String colour) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.colour = colour;
    }

    public String getName() {
        return this.name;
    }

    public abstract void speak();

    @Override
    public String toString() {
        String output = "------------------\n";
        output += "Name: " + name + "\n";
        output += "Age: " + age + "\n";
        output += "Breed: " + breed + "\n";
        output += "Colour: " + colour;

        return output;
    }
}
