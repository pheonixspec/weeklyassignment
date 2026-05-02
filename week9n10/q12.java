import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q12 {
    public static String[] splitUsingCharAt(String text) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character == ' ') {
                if (builder.length() > 0) {
                    words.add(builder.toString());
                    builder.setLength(0);
                }
            } else {
                builder.append(character);
            }
        }

        if (builder.length() > 0) {
            words.add(builder.toString());
        }

        return words.toArray(new String[0]);
    }

    public static boolean compareStringArrays(String[] first, String[] second) {
        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            String[] customWords = splitUsingCharAt(text);
            String[] builtInWords = text.trim().isEmpty() ? new String[0] : text.trim().split("\\s+");

            System.out.println("Custom words: " + Arrays.toString(customWords));
            System.out.println("Built-in words: " + Arrays.toString(builtInWords));
            System.out.println("Arrays match: " + compareStringArrays(customWords, builtInWords));
        }
    }
}