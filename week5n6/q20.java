import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] freq = new int[10];
        while (n != 0) {
            int digit = (int)(Math.abs(n) % 10);
            freq[digit]++;
            n /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println("Digit " + i + " frequency: " + freq[i]);
        }
    }
}