//I worked on the homework assignment alone, using only course materials.
import java.util.Scanner;

public class PageRank_soln {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a page name:");
        String pageName = input.next();
        System.out.println();
        System.out.println("How many outbound links does " + pageName
            + " have?");
        int numOutboundLinks = Integer.parseInt(input.next());
        int countVariable = numOutboundLinks;
        System.out.println();
        System.out.println("Available Pages:");
        System.out.println("Wikipedia" + "\n" + "Facebook" + "\n"
            + "TechCrunch" + "\n" + "Twitter" + "\n" + "BlueApron"
            + "\n" + "Instagram" + "\n" + "Pinterest" + "\n"
            + "Quora" + "\n" + "GrubHub" + "\n" + "Airbnb" + "\n");
        System.out.println("Which of the above pages does "
            + pageName + " link to?");

        double linkedPageValues = 0;
        while (countVariable > 0) {
            String linkedPage = input.next();
            linkedPage = linkedPage.replace(",", "");
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
            countVariable--;
        }
        System.out.println();
        System.out.println("What damping factor would you like to use?");
        double dampingNum = input.nextDouble();
        double pageRank = (1 - dampingNum) / numOutboundLinks
            + dampingNum * linkedPageValues;
        System.out.println();
        System.out.print("The PageRank of " + pageName + " is: ");
        System.out.printf("%.2f!", pageRank);
    }
}