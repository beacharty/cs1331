import java.util.*

public class Player {
    private String name;
    private BlackjackHand hand;

    public Player(String name, BlackjackHand hand) {
        this.name = name;
        this.hand = hand;
    }

    public void drawCard(Card card) {
        //called after human player decides to hit
        //draw card from deck in BlackjackGame
        hand.addCard(card);
    }

    public int score() {
        //called after human player decides to stand
        return hand.handVal(0);
    }
}