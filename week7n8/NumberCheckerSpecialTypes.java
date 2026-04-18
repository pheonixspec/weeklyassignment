import java.util.Scanner;

public class NumberCheckerSpecialTypes {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
    
    public static boolean isSpyNumber(int num) {
        int sum = 0, product = 1;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }
    
    public static boolean isAutomorphic(int num) {
        long square = (long) num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }
    
    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
        
        System.out.println("Is Prime: " + isPrime(num));
        System.out.println("Is Neon: " + isNeonNumber(num));
        System.out.println("Is Spy: " + isSpyNumber(num));
        System.out.println("Is Automorphic: " + isAutomorphic(num));
        System.out.println("Is Buzz: " + isBuzzNumber(num));
        }
    }
}
