import java.util.Scanner;

public class q9 {
    public static String toUpperCaseUsingCharAt(String text) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character >= 'a' && character <= 'z') {
                character = (char) (character - 32);
            }
            builder.append(character);
        }

        return builder.toString();
    }

    public static boolean compareStrings(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            String customUpper = toUpperCaseUsingCharAt(text);
            String builtInUpper = text.toUpperCase();

            System.out.println("Custom uppercase: " + customUpper);
            System.out.println("Built-in uppercase: " + builtInUpper);
            System.out.println("Comparison result: " + compareStrings(customUpper, builtInUpper));
        }
    }
}