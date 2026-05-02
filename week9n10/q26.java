import java.util.Arrays;
import java.util.Scanner;

public class q26 {
    public static String[][] frequencyUsingNestedLoops(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') {
                continue;
            }

            frequency[i] = 1;

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }

        String[][] result = new String[text.length()][2];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index][0] = String.valueOf(characters[i]);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return Arrays.copyOf(result, index);
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

            displayTable(frequencyUsingNestedLoops(text));
        }
    }
}