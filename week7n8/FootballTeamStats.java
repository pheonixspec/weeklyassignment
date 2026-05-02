import java.util.Scanner;

public class FootballTeamStats {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] heights = new double[11];
            System.out.println("Enter heights of 11 players (in cm):");
            
            for (int i = 0; i < 11; i++) {
                System.out.print("Player " + (i + 1) + ": ");
                heights[i] = sc.nextDouble();
            }
            
            double shortest = heights[0];
            double tallest = heights[0];
            double sum = 0;
            
            for (double height : heights) {
                if (height < shortest) shortest = height;
                if (height > tallest) tallest = height;
                sum += height;
            }
            
            double mean = sum / 11;
            
            System.out.println("Shortest: " + shortest + " cm");
            System.out.println("Tallest: " + tallest + " cm");
            System.out.println("Mean height: " + mean + " cm");
        }
    }
}
