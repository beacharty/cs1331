import java.util.*;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>(52);

    public Deck() {
        fillDeck();
    }

    public void fillDeck() {
        for(Card.Suit suit: Card.Suit.values()) {
            for(Card.Rank rank: Card.Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    //////////////////////Just a test method//////////////////////
    public void printDeck() {
        for(Card card: deck) {
            System.out.println(card);
        }
    }
    //////////////////////////////////////////////////////////////

    public void shuffle() {
        for(int i = 0; i < 250; i++) {
            int num1 = (int) (Math.random() * 52);
            int num2 = (int) (Math.random() * 52);
            Card temp = deck.get(num1);
            deck.set(num1, deck.get(num2));
            deck.set(num2, temp);
        }
    }

    public Card draw() {
        Card temp = deck.get(0);
        deck.remove(0);
        return temp;
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        d.printDeck();
        System.out.println();
        Card drawn = d.draw();
        System.out.println(drawn);
        System.out.println();
        d.printDeck();
    }
}