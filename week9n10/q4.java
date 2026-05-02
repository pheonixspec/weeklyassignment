public class q4 {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException exception) {
            System.out.println("Handled NullPointerException: " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException exception) {
            System.out.println("Generated NullPointerException: " + exception.getMessage());
        }

        handleException();
    }
}