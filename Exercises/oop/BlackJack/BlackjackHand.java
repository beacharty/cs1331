import java.util.*;

public class BlackjackHand {
    private ArrayList<Card> cards = new ArrayList<Card>();

    public BlackjackHand(Card up, FaceDownCard down) {
        cards.add(down);
        cards.add(up);
    }

    public void addCard(Card c) {
        cards.add(c);
    }

    //start index is 1 until first player stands.
    //then start index becomes 0 to get final tallies
    public int handVal(int start) {
        int val = 0;
        for(int i = start; i < cards.size(); i++) {
            val += cards.get(i).getCardVal();
        }
        int aces = numAce();
        while(aces > 0 && val > 21) {
            val -= 10;
            aces--;
        }
        return val;
    }

    public int numAce() {
        int count = 0;
        for(Card card: cards) {
            if(card.getRank() == Card.Rank.ACE) {
                count++;
            }
        }
        return count;
    }

    /////////////////////////////////////////////////
    public void printHand(boolean reveal) {
        for(Card card: cards) {
            if(reveal) {
                if(card instanceof FaceDownCard) {
                    card = ((FaceDownCard) card).flip();
                }
            }
            System.out.print(card + " || ");
        }
        if(reveal) {
            System.out.println(this.handVal(0));
        } else System.out.println(this.handVal(1));
    }
    /////////////////////////////////////////////////
}