import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // 1. Ask for two floating point numbers
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // 2. Perform Arithmetic Operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        
        // 3. Print the results
        System.out.println("\n--- Results ---");
        System.out.println("Addition:       " + number1 + " + " + number2 + " = " + addition);
        System.out.println("Subtraction:    " + number1 + " - " + number2 + " = " + subtraction);
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + multiplication);

        // 4. Handle Division (check for division by zero)
        if (number2 != 0) {
            double division = number1 / number2;
            System.out.println("Division:       " + number1 + " / " + number2 + " = " + division);
        } else {
            System.out.println("Division:       Error! Cannot divide by zero.");
        }

        // Close the scanner
        input.close();
    }
}