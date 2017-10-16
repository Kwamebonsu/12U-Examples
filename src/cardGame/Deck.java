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
        reset();
    }

    public void shuffle() {
        //Fischer-Yates Shuffle algorithm
        for (int i = 0; i < numCards; i++) {
            // generate random spot to swap with
            int spot = (int) (Math.random() * (numCards - i) + i);
            card temp = cards[i];
            cards[i] = cards[spot];
            cards[spot] = temp;

        }
        // Set shuffled to true
        isShuffled = true;
    }

    public boolean isShuffled() {
        return this.isShuffled;
    }

    public int getNumberCardsLeft() {
        return this.numCards;
    }

    public card dealCard() {
        // deal out a card
        this.numCards--;
        return this.cards[this.numCards];
    }
    // Restore the deck

    public void reset() {
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

    public void printDeck() {
        for (int i = numCards - 1; i >= 0; i--) {
            System.out.println(cards[i].toString());
        }
    }
}
