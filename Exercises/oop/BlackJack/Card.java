import java.util.*;

public class Card {
    public enum Suit { SPADES, HEARTS, DIAMONDS, CLUBS };
    public enum Rank { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING };


    private Suit suit;
    private Rank rank;

    public Card (Suit s, Rank r) {
        suit = s;
        rank = r;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getCardVal() {
        Rank r = this.rank;
        int val = 0;
        switch(r) {
            case JACK:
            case QUEEN:
            case KING:
            case ACE:
                val += 11;
                break;
            case TWO:
                val += 2;
                break;
            case THREE:
                val += 3;
                break;
            case FOUR:
                val += 4;
                break;
            case FIVE:
                val += 5;
                break;
            case SIX:
                val += 6;
                break;
            case SEVEN:
                val += 7;
                break;
            case EIGHT:
                val += 8;
                break;
            case NINE:
                val += 9;
                break;
            case TEN:
                val += 10;
                break;
        }
        return val;
    }

    @Override public String toString() {
        return rank + " of " + suit;
    }
}