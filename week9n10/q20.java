import java.util.Scanner;

public class q20 {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int) (Math.random() * 90);
            }
        }

        return scores;
    }

    public static String gradeForPercentage(double percentage) {
        if (percentage >= 90) {
            return "A+";
        }
        if (percentage >= 80) {
            return "A";
        }
        if (percentage >= 70) {
            return "B";
        }
        if (percentage >= 60) {
            return "C";
        }
        if (percentage >= 50) {
            return "D";
        }
        return "F";
    }

    public static void displayScorecard(int[][] scores) {
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-10s %-8s%n", "Stud", "Phy", "Chem", "Math", "Total", "Percent", "Grade");

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0) * 10000.0) / 100.0;
            String grade = gradeForPercentage(percentage);

            System.out.printf("%-8d %-8d %-8d %-8d %-8d %-10.2f %-8s%n", i + 1, scores[i][0], scores[i][1], scores[i][2], total, percentage, grade);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int students = sc.nextInt();

            int[][] scores = generateScores(students);
            displayScorecard(scores);
        }
    }
}