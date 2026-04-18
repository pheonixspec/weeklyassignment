import java.util.Random;

public class StudentScorecard {
    public static void main(String[] args) {
        Random rand = new Random();
        
        String[] subjects = {"Physics", "Chemistry", "Math"};
        int[][] scores = new int[3][3];
        int[] totals = new int[3];
        double[] averages = new double[3];
        
        System.out.println("=== Student Scorecard ===\n");
        System.out.println("Generating random scores for 3 subjects:");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            int total = 0;
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + rand.nextInt(61);
                total += scores[i][j];
                System.out.println(subjects[j] + ": " + scores[i][j]);
            }
            totals[i] = total;
            averages[i] = total / 3.0;
        }
        
        System.out.println("\n=== Summary Table ===");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage");
        System.out.println("=".repeat(60));
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\n", 
                i + 1, scores[i][0], scores[i][1], scores[i][2], totals[i], averages[i]);
        }
    }
}
