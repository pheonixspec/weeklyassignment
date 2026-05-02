import java.util.Arrays;
import java.util.Scanner;

public class q22 {
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

    public static char[] uniqueCharacters(String text) {
        char[] result = new char[lengthWithoutLengthMethod(text)];
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

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            System.out.println("Unique characters: " + Arrays.toString(uniqueCharacters(text)));
        }
    }
}