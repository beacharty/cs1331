import java.util.*;

public class Vector2{
    public final double x;
    public final double y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%.2f, %.2f).", this.x, this.y);
    }

    public Vector2 plus(Vector2 other) {
        double xnew = this.x + other.x;
        double ynew = this.y + other.y;
        Vector2 sum = new Vector2(xnew, ynew);
        return sum;
    }

    public Vector2 minus(Vector2 other) {
        double xnew = this.x - other.x;
        double ynew = this.y - other.y;
        Vector2 sub = new Vector2(xnew, ynew);
        return sub;
    }

    public double dot(Vector2 other) {
        return Math.round((this.x * other.x + this.y * other.y) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Vector2 a = new Vector2(1, 2.1);
        System.out.println(a);
        Vector2 b = new Vector2(-5.4, 3);
        System.out.println(b);
        Vector2 aPlusB = a.plus(b);
        System.out.println(aPlusB);
        Vector2 aMinusB = a.minus(b);
        System.out.println(aMinusB);
        double aDotB = a.dot(b);
        System.out.println(aDotB);
    }
}