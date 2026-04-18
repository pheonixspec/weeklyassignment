import java.util.Scanner;

public class QuotientAndRemainder {
    public static int[] divide(int a, int b) {
        int[] result = new int[2];
        result[0] = a / b;
        result[1] = a % b;
        return result;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter dividend: ");
            int a = sc.nextInt();
            System.out.print("Enter divisor: ");
            int b = sc.nextInt();
            
            int[] result = divide(a, b);
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }
    }
}
