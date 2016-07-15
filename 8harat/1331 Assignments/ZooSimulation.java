import java.util.Scanner;

public class ZooSimulation {

    // INSTANCE VARIABLES
    // YOUR CODE HERE
    // You can add any instance variables that you think will help you
    // write the homework.
    private Animal[] zooAnimals;

    public ZooSimulation() {
        // YOUR CODE HERE
        // You'll need to add the animals to this array, including your
        // custom animal. In the end there should be at least 6 elements
        zooAnimals = new Animal[]{};
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ZooSimulation zoo = new ZooSimulation();

        System.out.println("Welcome to The Atlanta Zoo!");

        int input = 0;
        while (input != 6) {
            System.out.println("\n\nWould you like to:");
            System.out.println("1. List all of the animals");
            System.out.println("2. See an output of all animals"
                                + " and their actions");
            System.out.println("3. Pet an animal");
            System.out.println("4. Feed an animal");
            System.out.println("5. Watch an animal");
            System.out.println("6. Quit");
            System.out.println("Please enter one of the options above:");

            input = scan.nextInt();
            while (input < 1 || input > 6) {
                System.out.println("Please enter a number 1-6");
                input = scan.nextInt();
            }

            if (input == 1) {
                zoo.printAnimals();
            } else if (input == 2) {
                zoo.makeAnimalSounds();
            } else if (input == 3) {
                zoo.petAnimals();
            } else if (input == 4) {
                zoo.feedAnimals();
            } else if (input == 5) {
                zoo.viewAnimals();
            }
        }
    }

    private void printAnimals() {
        // YOUR CODE HERE
        // Print the number of Animals instantiated

        // DONT CHANGE THE REST OF THIS METHOD
        for (Animal a : zooAnimals) {
            System.out.println(a);
        }
    }

    private void makeAnimalSounds() {
        System.out.println(); // This line is for cleaner formatting
        // YOUR CODE HERE
        // Invoke makeNoise and move for the animals in the zoo.
    }

    private void petAnimals() {
        System.out.println();  // This line is for cleaner formatting
        // YOUR CODE HERE
        // You need to randomly select a Pettable animal and then pet it.
    }

    private void feedAnimals() {
        System.out.println();  // This line is for cleaner formatting
        // YOUR CODE HERE
        // You need to randomly select a Feedable animal and then feed it.
    }

    private void viewAnimals() {
        System.out.println();  // This line is for cleaner formatting
        // YOUR CODE HERE
        // You need to randomly select a Viewable animal
        // and then attempt to view it.
    }

}