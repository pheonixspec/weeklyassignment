import java.util.Scanner;

public class NumberChecker {
    public static int checkNumber(int num) {
        if (num > 0) return 1;
        if (num < 0) return -1;
        return 0;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            
            int result = checkNumber(num);
            System.out.println("Result: " + result);
        }
    }
}
