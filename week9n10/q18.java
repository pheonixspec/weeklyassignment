import java.util.Scanner;

public class q18 {
    public static String[][] voteStatus(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = ages[i] >= 18 ? "Can Vote" : "Cannot Vote";
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Age", "Status");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] ages = new int[10];
            for (int i = 0; i < ages.length; i++) {
                System.out.print("Enter age of student " + (i + 1) + ": ");
                ages[i] = sc.nextInt();
            }

            displayTable(voteStatus(ages));
        }
    }
}