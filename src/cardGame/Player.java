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
public class Player {

    private ArrayList<card> hand;
    private String name;
    private int numCards;

    public Player(String name) {
        this.name = name;
        this.numCards = 0;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getNumCards() {
        return this.numCards;
    }

    public void takeCard(card c) {
        this.hand.add(c);
    }

    public card playCard() {
        this.numCards--;
        card c = this.hand.remove(0);
        return c;
    }

    public card[] get3Cards() {
        card[] cards = new card[3];
        for (int i = 0; i < 3; i++) {
            cards[i] = playCard();
        }
        return cards;
    }
}
