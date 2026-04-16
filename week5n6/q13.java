import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] digits = new int[10];
        int index = 0;
        while (n != 0 && index < 10) {
            digits[index++] = (int)(n % 10);
            n /= 10;
        }
        int max = -1, max2 = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > max) { max2 = max; max = digits[i]; }
            else if (digits[i] > max2 && digits[i] != max) max2 = digits[i];
        }
        System.out.println("Largest: " + max + ", Second: " + max2);
    }
}