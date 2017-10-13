/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;

/**
 *
 * @author bonsk5852
 */
public class Deck {

    private card[] cards;
    private int numCards;
    private boolean isShuffled;

    // Constructor
    public Deck() {
        this.numCards = 52;
        this.isShuffled = false;
        this.cards = new card[52];
        int i = 0;
        // put cards in the deck
        for (int rank = 1; rank <= 13; rank++) {
            for (int suit = 0; suit <= 3; suit++) {
                card c = new card(rank, suit);
                //this.cards[suit*rank] = c;
                this.cards[i] = c;
                i++;
            }
        }
    }

    public void shuffle() {
        //Knuth Shuffle algorithm
    }
}
