import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = (int) (Math.random()*10 +1);
        System.out.println(num);
        boolean quit = false;

        while (!quit) {
            System.out.print("Enter an integer between 1 and 10" +
                " (or 'quit' to exit): ");
            String cin = in.next();

            if (cin.trim().equalsIgnoreCase("quit")) {
                System.out.println("Lame. It was " + num);
                quit = true;
            } else if (Integer.parseInt(cin) == num) {
                System.out.println("Yay! You guessed it. It was " + num);
                quit = true;
            } else {
                System.out.println("Nope. Keep guessing!");
            }
        }
    }
}