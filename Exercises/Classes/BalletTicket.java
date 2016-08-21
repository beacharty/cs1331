import java.util.*;

public class BalletTicket {
    String section;
    int age;

    public BalletTicket(String section, int age) {
        if (section.equals("orchestra") || section.equals("mezzanine")) {
            this.section = section;
        } else {
            this.section = "orchestra";
            System.out.println(section + " is not a valid input." +
                "\nThe default, orchestra section was chosen.");
        }

        this.age = age;
    }

    public String getSection() {
        return this.section;
    }

    public double getPrice() {
        double price = 0;

        if (section.equals("orchestra")) {
            price = 50;
        } else price = 40;
        if (this.age >= 65) {
            price = price - price * 0.1;
        }

        return (price + price * 0.05);
    }

    public static void main (String[] args) {
        BalletTicket senior = new BalletTicket("mezzanine", 70);
        System.out.printf("Your %s ticket costs $%.2f.%n",
            senior.getSection(), senior.getPrice());
    }
}