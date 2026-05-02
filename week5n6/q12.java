import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3]; double[] heights = new double[3];
        for (int i = 0; i < 3; i++) { ages[i] = sc.nextInt(); heights[i] = sc.nextDouble(); }
        int y = ages[0]; double t = heights[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < y) y = ages[i];
            if (heights[i] > t) t = heights[i];
        }
        System.out.println("Youngest: " + y + ", Tallest: " + t);
    }
}