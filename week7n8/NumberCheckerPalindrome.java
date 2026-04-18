import java.util.Scanner;

public class NumberCheckerPalindrome {
    public static int[] getDigits(int num) {
        num = Math.abs(num);
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    
    public static int[] reverseDigits(int num) {
        int[] digits = getDigits(num);
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    
    public static boolean isPalindrome(int num) {
        int[] original = getDigits(num);
        int[] reversed = reverseDigits(num);
        if (original.length != reversed.length) return false;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }
    
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
        
        int[] digits = getDigits(num);
        int[] reversed = reverseDigits(num);
        boolean isPalin = isPalindrome(num);
        boolean isDuck = isDuckNumber(num);
        
        System.out.print("Original digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        
        System.out.print("Reversed digits: ");
        for (int d : reversed) System.out.print(d + " ");
        System.out.println();
        
        System.out.println("Is Palindrome: " + isPalin);
        System.out.println("Is Duck number: " + isDuck);
        }
    }
}
