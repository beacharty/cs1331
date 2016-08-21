import java.util.*;

public class BlackjackGame {
    public static Scanner in = new Scanner(System.in);
    public static Deck deck = new Deck();
    public static int numPlayers;

    public static void main(String[] args) {
        initializeGame();
        deck.shuffle();

    }

    public static void initializeGame() {
        System.out.print("Enter # of Human Players: ");
        String cin = in.next();
        while(!(isInt(cin) && Integer.parseInt(cin) <= 3)) {
            System.out.print("Invalid. Please enter an Integer less than 4: ");
            cin = in.next();
        }
        numPlayers = Integer.parseInt(cin);

    }

    private static boolean isInt(String str)
    {
        try
        {
            Integer.parseInt(str);
            return true;
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
    }
}