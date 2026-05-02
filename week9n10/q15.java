import java.util.Scanner;

public class q15 {
    public static boolean isVowel(char character) {
        char lower = character;
        if (lower >= 'A' && lower <= 'Z') {
            lower = (char) (lower + 32);
        }
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                if (isVowel(character)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[] {vowels, consonants};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            int[] counts = countVowelsAndConsonants(text);
            System.out.println("Vowels: " + counts[0]);
            System.out.println("Consonants: " + counts[1]);
        }
    }
}