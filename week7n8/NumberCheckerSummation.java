import java.util.Scanner;
import java.util.HashMap;

public class NumberCheckerSummation {
    public static int sumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    public static int sumOfSquaresOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
    
    public static boolean isHarshadNumber(int num) {
        int sum = sumOfDigits(num);
        return num % sum == 0;
    }
    
    public static HashMap<Integer, Integer> getFrequencyCount(int num) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        num = Math.abs(num);
        while (num > 0) {
            int digit = num % 10;
            freq.put(digit, freq.getOrDefault(digit, 0) + 1);
            num /= 10;
        }
        return freq;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
        
        int sum = sumOfDigits(num);
        int sumOfSquares = sumOfSquaresOfDigits(num);
        boolean isHarshad = isHarshadNumber(num);
        HashMap<Integer, Integer> frequency = getFrequencyCount(num);
        
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad number: " + isHarshad);
        System.out.println("Digit frequency: " + frequency);
        }
    }
}
