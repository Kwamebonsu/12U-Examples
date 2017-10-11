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

    public char getGender() {
        return gender;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human bob = new Human("Bob", 20, 'M');
        System.out.println(bob.getAge());

        Human alice = new Human("Alice", 31, 'F');
        System.out.println(alice.getName());
    }
}
