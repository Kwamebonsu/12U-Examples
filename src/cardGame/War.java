/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;

import java.util.ArrayList;

/**
 *
 * @author bonsk5852
 */
public class War {

    public static int winner(card p1Card, card p2Card) {
        // did a war happen
        if (p1Card.getRank() == p2Card.getRank()) {
            // war code

            System.out.println("WAR");
            return 0;

        } // Check if ACE is played
        else if ((p1Card.getRank() == 1 && p2Card.getRank() != 1 || p1Card.getRank() > p2Card.getRank())) {
            // player 1 wins

            System.out.println("Player 1 wins");
            // Take both cards
            p1.takeCard(p1Card);
            p1.takeCard(p2Card);
            return 1;
        } else if (p2Card.getRank() > p1Card.getRank() || (p2Card.getRank() == 1 && p1Card.getRank() != 1)) {
            // player 2 wins

            System.out.println("Player 2 wins");
            // Take both cards
            p1.takeCard(p1Card);
            p1.takeCard(p2Card);
            return 2;
        }
    }

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

            // who wins?
            int winner = winner(p1Card, p2Card);


            // did a war happen
            // create card pile for cards
            ArrayList<card> pile = new ArrayList<>();
            // keep playing until someone wins
            if (winner == 0) {

                while (winner == 0) {
                    // make sure players have enough cards
                    if (p1.getNumCards() < 4) {
                        //p1 loses
                        System.out.println("Player 1 ran out of cards!");
                        winner = 2;
                        // get rid of cards
                        while (p1.getNumCards() > 0) {
                            p1.playCard();
                        }
                        break;
                    } else if (p2.getNumCards() < 4) {
                        //p2 loses
                        System.out.println("Player 2 ran out of cards!");
                        winner = 1;
                        // get rid of cards
                        while (p2.getNumCards() > 0) {
                            p2.playCard();
                        }
                        break;
                    }
                    // draw 3 cards from each player  to add to the pile
                    System.out.println("WAR");
                    // add in already played cards
                    pile.add(p1Card);
                    pile.add(p2Card);
                    // add the 3 cards
                    card[] p1Cards = p1.get3Cards();
                    card[] p2Cards = p2.get3Cards();

                    for (int i = 0; i < 3; i++) {
                        pile.add(p1Cards[i]);
                        pile.add(p2Cards[i]);
                    }
                    // new card for each player
                    p1Card = p1.playCard();
                    p2Card = p2.playCard();
                    System.out.println("Player 1 plays " + p1Card);
                    System.out.println("Player 2 plays " + p2Card);
                    winner = winner(p1Card, p2Card);

                }

                // war is over
                // add pile to victor
                if (winner == 1) {
                    // for each card in the pile,
                    for (card aCard : pile) {
                        p1.takeCard(aCard);
                    }
                } else {
                    // for each card in the pile,
                    for (card aCard : pile) {
                        p2.takeCard(aCard);
                    }
                }

            } else if (winner == 1) {
                // player 1 wins
                System.out.println("Player 1 wins");
                // Take both cards
                p1.takeCard(p1Card);
                p1.takeCard(p2Card);
            } else if (winner == 2) {
                // player 2 wins
                System.out.println("Player 2 wins");
                // Take both cards
                p1.takeCard(p1Card);
                p1.takeCard(p2Card);
            }

            // Space to seperate rounds
            System.out.println("");
        }


        if (p1.getNumCards() > 0) {
            System.out.println("Player 1 wins!!!");
        } else {
            System.out.println("Player 2 wins!!!");
        }
    }
}
