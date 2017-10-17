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
            // Player 1 plays a card
            card p1Card = p1.playCard();
            System.out.println("Player 1  plays: " + p1Card);
            // Player 2 plays a card
            card p2Card = p2.playCard();
            System.out.println("Player 2 plays: " + p2Card);
            // did a war happen
            if (p1Card.getRank() == p2Card.getRank()) {
                // war code
                System.out.println("WAR");
                // Check if ACE is played
            } else if (p1Card.getRank() > p2Card.getRank() || p1Card.getRank() == 1) {
                // player 1 wins
                System.out.println("Player 1 wins");
                // Take both cards
                p1.takeCard(p1Card);
                p1.takeCard(p2Card);
            } else {
                // player 2 wins
                // player 1 wins
                System.out.println("Player 2 wins");
                // Take both cards
                p1.takeCard(p1Card);
                p1.takeCard(p2Card);
            }
            // Space to seperate rounds
            System.out.println("");
        }
    }
}
