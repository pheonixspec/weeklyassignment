import java.util.Scanner;

public class RecursiveSum {
    public static long recursiveSum(int n) {
        if (n <= 0) return 0;
        return n + recursiveSum(n - 1);
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            
            long recursive = recursiveSum(n);
            long formula = (long) n * (n + 1) / 2;
            
            System.out.println("Recursive sum: " + recursive);
            System.out.println("Formula sum: " + formula);
            System.out.println("Both methods give same result: " + (recursive == formula));
        }
    }
}
