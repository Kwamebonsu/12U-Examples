/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.examples;

import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class TextFileExample {
    // contact list

    private Contact[] contacts;
    private int position = 0;
    private ContactsGUI gui;
    // constructor

    public TextFileExample(ContactsGUI gui) {
        // create a blank file reader
        FileReader file = null;
        try {
//         // If the input.txt file is in pkg12u.examples
//            URL url = TextFileExample.class.getResource("input.txt");
//            file = new FileReader(url.getFile());
            URL url = ClassLoader.getSystemClassLoader().getResource("input.txt");
            // Creating the file reader
            file = new FileReader("input.txt");
        } catch (Exception e) {
            // handle any errors
            // print out the lovely red errors
            e.printStackTrace();
            // exit the program
            System.exit(0);
        }

        // Use a Scanner
        Scanner in = new Scanner(file);
        // Get the number of addresses
        int numAdresses = in.nextInt();
        // Move to the next line
        in.nextLine();
        // create an empty rolodex
        this.contacts = new Contact[numAdresses];
        // go through the file
        for (int i = 0; i < numAdresses; i++) {
            String name = in.next();
            String phone = in.next();
            String email = in.nextLine().trim();
            // create each contact
            Contact c = new Contact(name);
            c.setNumber(phone);
            c.setEmail(email);
            // add contact to rolodex
            this.contacts[i] = c;
        }
    }

    public String getName() {
        return contacts[position].getName();
    }

    public String getPhone() {
        return contacts[position].getPhone();
    }

    public String getEmail() {
        return contacts[position].getEmail();
    }

    public int numContacts() {
        return contacts.length;
    }

    public int getPosition() {
        return position;
    }

    public void next() {
        if (position < contacts.length - 1) {
            // move to next spot
            position++;
        }
    }

    public void prev() {
        if (position > 0) {
            // move back
            position--;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a blank file reader
        FileReader file = null;
        try {
//         // If the input.txt file is in pkg12u.examples
//            URL url = TextFileExample.class.getResource("input.txt");
//            file = new FileReader(url.getFile());
            URL url = ClassLoader.getSystemClassLoader().getResource("input.txt");
            // Creating the file reader
            file = new FileReader("input.txt");
        } catch (Exception e) {
            // handle any errors
            // print out the lovely red errors
            e.printStackTrace();
            // exit the program
            System.exit(0);
        }

        // Use a Scanner
        Scanner in = new Scanner(file);
        // Get the number of addresses
        int numAdresses = in.nextInt();
        // Move to the next line
        in.nextLine();
        // create an empty rolodex
        Contact[] contacts = new Contact[numAdresses];
        // go through the file
        for (int i = 0; i < numAdresses; i++) {
            String name = in.next();
            String phone = in.next();
            String email = in.nextLine().trim();
            // create each contact
            Contact c = new Contact(name);
            c.setNumber(phone);
            c.setEmail(email);
            // add contact to rolodex
            contacts[i] = c;
        }

        // print out the rolodex
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i]);
        }

    }
}
