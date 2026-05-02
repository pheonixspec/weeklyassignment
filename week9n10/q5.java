import java.util.Scanner;

public class q5 {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            try {
                generateException(text);
            } catch (StringIndexOutOfBoundsException exception) {
                System.out.println("Generated StringIndexOutOfBoundsException: " + exception.getMessage());
            }

            handleException(text);
        }
    }
}