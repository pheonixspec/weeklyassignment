import java.util.Scanner;

public class q11 {
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

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.next();

            System.out.println("Custom length: " + lengthWithoutLengthMethod(text));
            System.out.println("Built-in length: " + text.length());
        }
    }
}