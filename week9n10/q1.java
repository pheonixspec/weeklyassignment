import java.util.Scanner;

public class q1 {
    public static boolean compareUsingCharAt(String first, String second) {
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
            System.out.print("Enter first string: ");
            String first = sc.next();
            System.out.print("Enter second string: ");
            String second = sc.next();

            boolean charAtResult = compareUsingCharAt(first, second);
            boolean equalsResult = first.equals(second);

            System.out.println("charAt comparison: " + charAtResult);
            System.out.println("equals comparison: " + equalsResult);
        }
    }
}