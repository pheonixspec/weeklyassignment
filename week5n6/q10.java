import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            String[] res = new String[n + 1];
            for (int i = 0; i <= n; i++) {
                if (i == 0) res[i] = "0";
                else if (i % 3 == 0 && i % 5 == 0) res[i] = "FizzBuzz";
                else if (i % 3 == 0) res[i] = "Fizz";
                else if (i % 5 == 0) res[i] = "Buzz";
                else res[i] = String.valueOf(i);
            }
            for (int i = 0; i <= n; i++) System.out.println("Position " + i + " = " + res[i]);
        }
    }
}