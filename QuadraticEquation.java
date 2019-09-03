package OOP;
import java.util.Scanner;
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;
    public QuadraticEquation(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant() {
        this.delta = this.b*this.b - 4*this.a*this.c;
        return this.delta;
    }
    public double getRoot1 () {
        double root1;
        if (this.getDiscriminant() >= 0) {
            root1 = (-this.b + Math.sqrt(this.delta))/(2*this.a);
            return root1;
        }else {
            return 0;
        }
    }
    public double getRoot2 () {
        double root2;
        if (this.getDiscriminant() >= 0) {
            root2 = (-this.b - Math.sqrt(this.delta))/(2*a);
            return root2;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = scanner.nextDouble();
        System.out.println("Enter b :");
        double b = scanner.nextDouble();
        System.out.println("Enter c :");
        double c = scanner.nextDouble();

        QuadraticEquation quadra = new QuadraticEquation(a,b,c);
        if (quadra.getRoot1() == 0) {
            System.out.println("NO ROOT!");
        }else {
            System.out.println("First root is :"+ quadra.getRoot1());
            System.out.println("Second root is :"+ quadra.getRoot2());
        }

    }

}
