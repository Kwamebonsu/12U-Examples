/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;

/**
 *
 * @author bonsk5852
 */
public class TestCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a deck
        Deck deck = new Deck();
        // Shuffle the deck
        deck.shuffle();
        deck.printDeck();
        // Deal 2 cards
        card c = deck.dealCard();
        System.out.println("Card: " + c);
        c = deck.dealCard();
        System.out.println("Card: " + c);
    }
}
