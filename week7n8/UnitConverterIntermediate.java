import java.util.Scanner;

public class UnitConverterIntermediate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. yards to feet");
            System.out.println("2. feet to yards");
            System.out.println("3. meters to inches");
            System.out.println("4. inches to meters");
            System.out.println("5. inches to cm");
            System.out.println("6. cm to inches");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            
            System.out.print("Enter value: ");
            double value = sc.nextDouble();
            
            switch (choice) {
            case 1 ->
                System.out.println(value + " yards = " + (value * 3) + " feet");
            case 2 ->
                System.out.println(value + " feet = " + (value / 3) + " yards");
            case 3 ->
                System.out.println(value + " m = " + (value * 39.3701) + " inches");
            case 4 ->
                System.out.println(value + " inches = " + (value / 39.3701) + " m");
            case 5 ->
                System.out.println(value + " inches = " + (value * 2.54) + " cm");
            case 6 ->
                System.out.println(value + " cm = " + (value / 2.54) + " inches");
            default ->
                System.out.println("Invalid choice");
            }
        }
    }
}
