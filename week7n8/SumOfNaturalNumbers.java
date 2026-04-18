import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            
            System.out.println("Sum of first " + n + " natural numbers: " + sum);
        }
    }
}
