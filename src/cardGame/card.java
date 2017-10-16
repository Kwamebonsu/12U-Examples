/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;

/**
 * A class to represent a single playing card
 *
 * @author bonsk5852
 */
public class card {
    // suit constants

    public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int SPADES = 2;
    public static final int HEARTS = 3;
    // instance variable
    private int rank;
    private int suit;

    // constructor
    /**
     * The constructor for a single playing card
     *
     * @param rank The rank of the card (1-13)
     * @param suit The suit of the card
     */
    public card(int rank, int suit) {
        this.suit = suit;
        this.rank = rank;
    }
// Accessor methods

    /**
     * get the suit of the card
     *
     * @return the suit of the card
     */
    public int getSuit() {
        return this.suit;
    }

    /**
     * get the rank of the card
     *
     * @return the rank of the card
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * Determines if this card is bigger than another card
     *
     * @param c the other card
     * @return true if the card is bigger than the Card c.
     */
    public boolean isBigger(card c) {
        // is this card bigger than card c?
        if (this.rank > c.getRank()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Pretty version of a card
     *
     * @return
     */
    @Override
    public String toString() {
        String output = "";
        // Add the rank to the String
        if (this.rank == 1) {
            output += "Ace";
        } else if (this.rank <= 10) {
            output += this.rank;
        } else if (this.rank == 11) {
            output += "Jack";
        } else if (this.rank == 12) {
            output += "Queen";
        } else if (this.rank == 13) {
            output += "King";
        }
        output += " of ";

        if (this.suit == CLUBS) {
            output += "\u2663";
        } else if (this.suit == DIAMONDS) {
            output += "\u2662";
        } else if (this.suit == SPADES) {
            output += "\u2660";
        } else if (this.suit == HEARTS) {
            output += "\u2661";
        }
        return output;
    }
}
