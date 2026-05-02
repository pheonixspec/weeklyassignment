import java.util.Scanner;

public class q7 {
    public static void generateException(String text) {
        System.out.println(Integer.parseInt(text));
    }

    public static void handleException(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException exception) {
            System.out.println("Handled NumberFormatException: " + exception.getMessage());
        } catch (RuntimeException exception) {
            System.out.println("Handled runtime exception: " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            try {
                generateException(text);
            } catch (NumberFormatException exception) {
                System.out.println("Generated NumberFormatException: " + exception.getMessage());
            }

            handleException(text);
        }
    }
}