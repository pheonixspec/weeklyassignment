import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of people (n): ");
            int n = sc.nextInt();
            
            long handshakes = (long) n * (n - 1) / 2;
            
            System.out.println("Maximum handshakes: " + handshakes);
        }
    }
}
