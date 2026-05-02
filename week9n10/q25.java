import java.util.Arrays;
import java.util.Scanner;

public class q25 {
    public static char[] uniqueCharacters(String text) {
        char[] result = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == character) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                result[index++] = character;
            }
        }

        return Arrays.copyOf(result, index);
    }

    public static String[][] frequencyUsingUniqueChars(String text) {
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == unique[i]) {
                    count++;
                }
            }
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(count);
        }

        return result;
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

            displayTable(frequencyUsingUniqueChars(text));
        }
    }
}