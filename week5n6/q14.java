import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];
        while (n != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, index);
                digits = temp;
            }
            digits[index++] = (int)(n % 10);
            n /= 10;
        }
        int m1 = -1, m2 = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > m1) { m2 = m1; m1 = digits[i]; }
            else if (digits[i] > m2) m2 = digits[i];
        }
        System.out.println("Largest: " + m1 + " Second: " + m2);
    }
}