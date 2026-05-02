import java.util.Scanner;

public class ArrayAnalysis {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] numbers = new int[5];
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }
            
            System.out.println("\nSign Analysis:");
            for (int i = 0; i < 5; i++) {
                String sign = numbers[i] > 0 ? "Positive" : numbers[i] < 0 ? "Negative" : "Zero";
                System.out.println(numbers[i] + " is " + sign);
            }
            
            System.out.println("\nParity Analysis:");
            for (int i = 0; i < 5; i++) {
                String parity = numbers[i] % 2 == 0 ? "Even" : "Odd";
                System.out.println(numbers[i] + " is " + parity);
            }
            
            System.out.println("\nComparison:");
            if (numbers[0] > numbers[4]) {
                System.out.println("First element is greater");
            } else if (numbers[0] < numbers[4]) {
                System.out.println("Last element is greater");
            } else {
                System.out.println("Both elements are equal");
            }
        }
    }
}
