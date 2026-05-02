import java.util.ArrayList;
import java.util.Scanner;

public class q14 {
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

    public static int[] shortestAndLongest(String[][] wordsAndLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordsAndLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsAndLengths[i][1]);
            if (currentLength < Integer.parseInt(wordsAndLengths[shortestIndex][1])) {
                shortestIndex = i;
            }
            if (currentLength > Integer.parseInt(wordsAndLengths[longestIndex][1])) {
                longestIndex = i;
            }
        }

        return new int[] {shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            String[] words = splitUsingCharAt(text);
            if (words.length == 0) {
                System.out.println("No words found.");
                return;
            }

            String[][] table = wordsAndLengths(words);
            int[] positions = shortestAndLongest(table);

            System.out.println("Shortest word: " + table[positions[0]][0]);
            System.out.println("Longest word: " + table[positions[1]][0]);
        }
    }
}