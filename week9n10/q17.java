import java.util.Scanner;

public class q17 {
    public static int[] trimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] {start, end + 1};
    }

    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder builder = new StringBuilder();

        for (int i = start; i < end && i < text.length(); i++) {
            builder.append(text.charAt(i));
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
            System.out.print("Enter text with spaces: ");
            String text = sc.nextLine();

            int[] indexes = trimIndexes(text);
            String customTrim = substringUsingCharAt(text, indexes[0], indexes[1]);
            String builtInTrim = text.trim();

            System.out.println("Custom trim: " + customTrim);
            System.out.println("Built-in trim: " + builtInTrim);
            System.out.println("Comparison result: " + compareStrings(customTrim, builtInTrim));
        }
    }
}