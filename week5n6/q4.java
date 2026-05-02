import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            double input = sc.nextDouble();
            if (input <= 0 || index == 10) break;
            nums[index++] = input;
        }
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
            total += nums[i];
        }
        System.out.println("\nTotal sum: " + total);
    }
}