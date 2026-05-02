import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Principal (P): ");
            double p = sc.nextDouble();
            System.out.print("Enter Rate (R): ");
            double r = sc.nextDouble();
            System.out.print("Enter Time (T) in years: ");
            double t = sc.nextDouble();
            
            double si = (p * r * t) / 100;
            
            System.out.println("Simple Interest: " + si);
        }
    }
}
