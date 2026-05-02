import java.util.Scanner;

public class NumberCheckerDigits {
    public static int countDigits(int num) {
        num = Math.abs(num);
        return String.valueOf(num).length();
    }
    
    public static int[] getDigits(int num) {
        num = Math.abs(num);
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }
    
    public static boolean isArmstrongNumber(int num, int digitCount) {
        int sum = 0;
        int temp = Math.abs(num);
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);
            temp /= 10;
        }
        return sum == Math.abs(num);
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
        
        int[] digits = getDigits(num);
        int digitCount = countDigits(num);
        int largestDigit = digits[0];
        int smallestDigit = digits[0];
        
        for (int digit : digits) {
            if (digit > largestDigit) largestDigit = digit;
            if (digit < smallestDigit) smallestDigit = digit;
        }
        
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Is Duck number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong number: " + isArmstrongNumber(num, digitCount));
        System.out.println("Largest digit: " + largestDigit);
        System.out.println("Smallest digit: " + smallestDigit);
        }
    }
}
