/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;

/**
 *
 * @author bonsk5852
 */
public class War {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create deck of cards
        Deck deck = new Deck();
        // Create 2 players
        Player p1 = new Player("Alice");
        Player p2 = new Player("Bob");
        // Shuffle the deck
        deck.shuffle();
        // Deal the cards
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                p1.takeCard(deck.dealCard());
            } else {
                p2.takeCard(deck.dealCard());
            }
        }

        // Game time!!!!!
        // As long as both players have cards
        while (p1.getNumCards() > 0 && p2.getNumCards() > 0) {
        }
    }
}
