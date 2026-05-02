import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q13 {
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

    public static int lengthWithoutLengthMethod(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException exception) {
                return count;
            }
        }
    }

    public static String[][] wordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(lengthWithoutLengthMethod(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            String[] words = splitUsingCharAt(text);
            String[][] table = wordsAndLengths(words);

            System.out.printf("%-20s %-10s%n", "Word", "Length");
            for (String[] row : table) {
                System.out.printf("%-20s %-10d%n", row[0], Integer.parseInt(row[1]));
            }
            System.out.println("Words: " + Arrays.toString(words));
        }
    }
}