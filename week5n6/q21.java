import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[10];
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) freq[c - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println("Digit " + i + ": " + freq[i]);
        }
    }
}