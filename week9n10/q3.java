import java.util.Arrays;
import java.util.Scanner;

public class q3 {
    public static char[] charactersWithoutToCharArray(String text) {
        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    public static boolean compareArrays(char[] first, char[] second) {
        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            char[] customChars = charactersWithoutToCharArray(text);
            char[] builtInChars = text.toCharArray();

            System.out.println("Custom chars: " + Arrays.toString(customChars));
            System.out.println("Built-in chars: " + Arrays.toString(builtInChars));
            System.out.println("Arrays match: " + compareArrays(customChars, builtInChars));
        }
    }
}