import java.util.ArrayList;
import java.util.Scanner;

public class FactorsAnalysis {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            
            ArrayList<Integer> factors = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    factors.add(i);
                }
            }
            
            long sum = 0;
            long sumOfSquares = 0;
            long product = 1;
            
            for (int factor : factors) {
                sum += factor;
                sumOfSquares += (long) factor * factor;
                product *= factor;
            }
            
            System.out.println("Factors: " + factors);
            System.out.println("Sum of factors: " + sum);
            System.out.println("Sum of squares of factors: " + sumOfSquares);
            System.out.println("Product of factors: " + product);
        }
    }
}
