import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] digits = s.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) System.out.print(digits[i]);
    }
}