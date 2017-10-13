/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.examples;

/**
 *
 * @author bonsk5852
 */
public class Human {

    // define instance variables
    private String name;
    private int age;
    private char gender;

    // Constructor
    // used to create individual humans
    // "Setup" a human to use
    public Human(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // Accessor method (Getter)- Gets a variable

    public char getGender() {
        return gender;
    }

    public void celebrateBirthday() {
        // Increase human age by 1
        this.age++;
        // Wish them a happy birthday
        System.out.println("Happy Birthday " + this.name + "!");
    }
    // Mutator method (Setter) - changes value

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human bob = new Human("Bob", 20, 'M');
        System.out.println(bob.getName());
        System.out.println(bob.getAge());

        Human alice = new Human("Alice", 51, 'F');
        System.out.println(alice.getName());
        System.out.println(alice.getAge());

        bob.celebrateBirthday();
        System.out.println(bob.getAge());
        System.out.println(alice.getAge());
    }
}
