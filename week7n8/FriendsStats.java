import java.util.Scanner;

public class FriendsStats {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] names = new String[3];
            int[] ages = new int[3];
            double[] heights = new double[3];
            
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter name of friend " + (i + 1) + ": ");
                names[i] = sc.next();
                System.out.print("Enter age: ");
                ages[i] = sc.nextInt();
                System.out.print("Enter height (in cm): ");
                heights[i] = sc.nextDouble();
            }
            
            int youngestIdx = 0;
            int tallestIdx = 0;
            
            for (int i = 1; i < 3; i++) {
                if (ages[i] < ages[youngestIdx]) youngestIdx = i;
                if (heights[i] > heights[tallestIdx]) tallestIdx = i;
            }
            
            System.out.println("Youngest: " + names[youngestIdx] + " (age " + ages[youngestIdx] + ")");
            System.out.println("Tallest: " + names[tallestIdx] + " (height " + heights[tallestIdx] + " cm)");
        }
    }
}
