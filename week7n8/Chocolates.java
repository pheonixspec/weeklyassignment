import java.util.Scanner;

public class Chocolates {
    public static int[] divideChocolates(int n, int m) {
        int[] result = new int[2];
        result[0] = n / m;
        result[1] = n % m;
        return result;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of chocolates (N): ");
            int n = sc.nextInt();
            System.out.print("Enter number of children (M): ");
            int m = sc.nextInt();
            
            int[] result = divideChocolates(n, m);
            System.out.println("Chocolates per child: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }
    }
}
