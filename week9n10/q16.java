import java.util.Scanner;

public class q16 {
    public static String classifyCharacter(char character) {
        char lower = character;
        if (lower >= 'A' && lower <= 'Z') {
            lower = (char) (lower + 32);
        }

        if (lower >= 'a' && lower <= 'z') {
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }

        return "Not a Letter";
    }

    public static String[][] classifyText(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = classifyCharacter(text.charAt(i));
        }

        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            displayTable(classifyText(text));
        }
    }
}