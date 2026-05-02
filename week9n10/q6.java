import java.util.Scanner;

public class q6 {
    public static void generateException(String text, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index");
        }

        System.out.println(text.substring(start, end));
    }

    public static void handleException(String text, int start, int end) {
        try {
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index");
            }

            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException exception) {
            System.out.println("Handled IllegalArgumentException: " + exception.getMessage());
        } catch (RuntimeException exception) {
            System.out.println("Handled runtime exception: " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            System.out.print("Enter start index: ");
            int start = sc.nextInt();
            System.out.print("Enter end index: ");
            int end = sc.nextInt();

            try {
                generateException(text, start, end);
            } catch (IllegalArgumentException exception) {
                System.out.println("Generated IllegalArgumentException: " + exception.getMessage());
            } catch (RuntimeException exception) {
                System.out.println("Generated runtime exception: " + exception.getMessage());
            }

            handleException(text, start, end);
        }
    }
}