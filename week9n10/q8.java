import java.util.Scanner;

public class q8 {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of names: ");
            int count = sc.nextInt();
            String[] names = new String[count];

            for (int i = 0; i < count; i++) {
                System.out.print("Enter name " + (i + 1) + ": ");
                names[i] = sc.next();
            }

            try {
                generateException(names);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Generated ArrayIndexOutOfBoundsException: " + exception.getMessage());
            }

            handleException(names);
        }
    }
}