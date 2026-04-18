import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] p = new double[n], c = new double[n], m = new double[n], pct = new double[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextDouble(); c[i] = sc.nextDouble(); m[i] = sc.nextDouble();
            if (p[i] < 0 || c[i] < 0 || m[i] < 0) { i--; continue; }
            pct[i] = (p[i] + c[i] + m[i]) / 3.0;
            System.out.println("Student " + (i+1) + " Percentage: " + pct[i]);
        }
    }
}