public class q4 {
    public static void generateException() {
        String text = null;
        triggerNullPointer(text);
    }

    public static void handleException() {
        try {
            String text = null;
            triggerNullPointer(text);
        } catch (NullPointerException exception) {
            System.out.println("Handled NullPointerException: " + exception.getMessage());
        }
    }

    private static void triggerNullPointer(String text) {
        if (text == null) {
            throw new NullPointerException("text is null");
        }

        System.out.println(text.length());
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