import java.util.Scanner;

public class q28 {
    public static boolean areAnagrams(String first, String second) {
        String left = first.replace(" ", "").toLowerCase();
        String right = second.replace(" ", "").toLowerCase();

        if (left.length() != right.length()) {
            return false;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < left.length(); i++) {
            frequency[left.charAt(i)]++;
            frequency[right.charAt(i)]--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first text: ");
            String first = sc.nextLine();
            System.out.print("Enter second text: ");
            String second = sc.nextLine();

            System.out.println("Anagram result: " + areAnagrams(first, second));
        }
    }
}