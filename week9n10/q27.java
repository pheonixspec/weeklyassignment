import java.util.Scanner;

public class q27 {
    public static boolean palindromeByLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean palindromeByRecursion(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return palindromeByRecursion(text, start + 1, end - 1);
    }

    public static char[] reverseUsingCharAt(String text) {
        char[] reverse = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }

        return reverse;
    }

    public static boolean palindromeByArrays(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseUsingCharAt(text);

        if (original.length != reverse.length) {
            return false;
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            System.out.println("Loop palindrome: " + palindromeByLoop(text));
            System.out.println("Recursive palindrome: " + palindromeByRecursion(text, 0, text.length() - 1));
            System.out.println("Array palindrome: " + palindromeByArrays(text));
        }
    }
}