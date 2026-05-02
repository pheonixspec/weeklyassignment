import java.util.ArrayList;
import java.util.Scanner;

public class q24 {
    public static String[][] frequencyUsingAscii(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        ArrayList<String[]> result = new ArrayList<>();
        boolean[] visited = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (!visited[character]) {
                visited[character] = true;
                result.add(new String[] {String.valueOf(character), String.valueOf(frequency[character])});
            }
        }

        return result.toArray(new String[0][0]);
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            displayTable(frequencyUsingAscii(text));
        }
    }
}