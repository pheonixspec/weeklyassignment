import java.util.Scanner;

public class q2 {
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
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            System.out.print("Enter start index: ");
            int start = sc.nextInt();
            System.out.print("Enter end index: ");
            int end = sc.nextInt();

            String customSubstring = substringUsingCharAt(text, start, end);
            String builtInSubstring = text.substring(start, end);

            System.out.println("Custom substring: " + customSubstring);
            System.out.println("Built-in substring: " + builtInSubstring);
            System.out.println("Comparison result: " + compareStrings(customSubstring, builtInSubstring));
        }
    }
}