import java.util.Scanner;

public class UnitConverterAdvanced {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. pounds to kg");
            System.out.println("4. kg to pounds");
            System.out.println("5. gallons to liters");
            System.out.println("6. liters to gallons");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            
            System.out.print("Enter value: ");
            double value = sc.nextDouble();
            
            switch (choice) {
            case 1 ->
                System.out.println(value + "°F = " + ((value - 32) * 5 / 9) + "°C");
            case 2 ->
                System.out.println(value + "°C = " + ((value * 9 / 5) + 32) + "°F");
            case 3 ->
                System.out.println(value + " lbs = " + (value * 0.453592) + " kg");
            case 4 ->
                System.out.println(value + " kg = " + (value / 0.453592) + " lbs");
            case 5 ->
                System.out.println(value + " gallons = " + (value * 3.78541) + " liters");
            case 6 ->
                System.out.println(value + " liters = " + (value / 3.78541) + " gallons");
            default ->
                System.out.println("Invalid choice");
            }
        }
    }
}
