import java.util.Scanner;

public class chapterTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("insert integer: ");
        int num1 = in.nextInt();
        System.out.print("insert integer: ");
        int num2 = in.nextInt();
        // System.out.println(num1 % num2);
        // System.out.println("25 / 4 is " + 25 / 4);
        // System.out.println("25 / 4.0 is " + 25 / 4.0);
        // System.out.println("3 * 2 / 4.0 is " + 3 * 2 / 4.0);
        // System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
        // System.out.println(2*(5/2+5/2));
        // System.out.println((double) (2*5/2+2*5/2));
        // System.out.println((int) (2*(5.0/2)));
        // System.out.println(2*5/2);
        // System.out.println(Math.pow(2,3.5));
        // System.out.println((float) (num1*num2*num2));
        //int n = 2.2; error!! can't cast higher precision to lower precision
        int n = (int) 2.2;
        System.out.println(n);
    }
}