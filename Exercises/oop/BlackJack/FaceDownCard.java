public class FaceDownCard extends Card {
    public FaceDownCard(Suit s, Rank r) {
        super(s, r);
    }

    @Override public String toString() {
        return "Card";
    }

    public Card flip() {
        Suit s = this.getSuit();
        Rank r = this.getRank();
        return new Card(s, r);
    }
}