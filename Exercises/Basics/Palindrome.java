public class Palindrome {
    public static void main(String[] args) {
        String word = args[0].trim().toLowerCase().replaceAll("\\s", "");
        Boolean palindrome = true;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length()-1-i)
                && palindrome) {
                palindrome = true;
            } else palindrome = false;
        }

        if (palindrome) {
            System.out.println(args[0].trim() + " is a Palindrome.");
        } else System.out.println(args[0].trim() + " is not a Palindrome.");
    }
}