import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] w = new double[n], h = new double[n], bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextDouble(); h[i] = sc.nextDouble();
            bmi[i] = w[i] / (h[i] * h[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal";
            else status[i] = "Overweight";
            System.out.println("BMI: " + bmi[i] + " Status: " + status[i]);
        }
    }
}