import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) marks[i][j] = sc.nextDouble();
            double avg = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            System.out.println("Percentage: " + avg);
        }
    }
}