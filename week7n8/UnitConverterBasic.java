import java.util.Scanner;

public class UnitConverterBasic {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. km to miles");
            System.out.println("2. miles to km");
            System.out.println("3. meters to feet");
            System.out.println("4. feet to meters");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            
            System.out.print("Enter value: ");
            double value = sc.nextDouble();
            
            switch (choice) {
            case 1 ->
                System.out.println(value + " km = " + (value * 0.621371) + " miles");
            case 2 ->
                System.out.println(value + " miles = " + (value / 0.621371) + " km");
            case 3 ->
                System.out.println(value + " m = " + (value * 3.28084) + " feet");
            case 4 ->
                System.out.println(value + " feet = " + (value / 3.28084) + " m");
            default ->
                System.out.println("Invalid choice");
            }
        }
    }
}
