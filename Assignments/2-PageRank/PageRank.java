import java.util.Scanner;

public class PageRank {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a page name: ");
        String page = in.next();
        System.out.println("\nHow many outbound links does " + page + " have? ");
        int numlinks = in.nextInt();
        System.out.println("\nAvailable Pages:");
        System.out.println("Wikipedia" + "\n" + "Facebook" + "\n"
            + "TechCrunch" + "\n" + "Twitter" + "\n" + "BlueApron"
            + "\n" + "Instagram" + "\n" + "Pinterest" + "\n"
            + "Quora" + "\n" + "GrubHub" + "\n" + "Airbnb" + "\n");
        System.out.println("Which of the above pages does " + page + " link to? ");

        double linkedPageValues = 0;
        int count = numlinks;

        while (count > 0) {
            String linkedPage = in.next();
            linkedPage = linkedPage.replace(",","");
            if (linkedPage.equals("Wikipedia")) {
                linkedPageValues += 4.0 / 10;
            }
            if (linkedPage.equals("Facebook")) {
                linkedPageValues +=  4.0 / 8;
            }
            if (linkedPage.equals("TechCrunch")) {
                linkedPageValues += 3.0 / 6;
            }
            if (linkedPage.equals("Twitter")) {
                linkedPageValues += 4.0 / 6;
            }
            if (linkedPage.equals("BlueApron")) {
                linkedPageValues += 1.0 / 4;
            }
            if (linkedPage.equals("Instagram")) {
                linkedPageValues += 1.0 / 1;
            }
            if (linkedPage.equals("Pinterest")) {
                linkedPageValues += 4.0 / 7;
            }
            if (linkedPage.equals("Quora")) {
                linkedPageValues += 3.0 / 5;
            }
            if (linkedPage.equals("GrubHub")) {
                linkedPageValues += 2.0 / 2;
            }
            if (linkedPage.equals("Airbnb")) {
                linkedPageValues += 2.0 / 4;
            }
            count--;
        }

        System.out.println("\nWhat damping factor would you like to use?");
        double d = in.nextDouble();
        double rank = (1 - d) / numlinks + d * linkedPageValues;

        System.out.printf("\nThe PageRank of %s is:%n%.2f%n", page, rank);
    }
}