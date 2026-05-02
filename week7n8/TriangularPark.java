import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter side 1 (in km): ");
            double side1 = sc.nextDouble();
            System.out.print("Enter side 2 (in km): ");
            double side2 = sc.nextDouble();
            System.out.print("Enter side 3 (in km): ");
            double side3 = sc.nextDouble();
            
            double perimeter = side1 + side2 + side3;
            double rounds = 5.0 / perimeter;
            
            System.out.println("Perimeter: " + perimeter + " km");
            System.out.println("Rounds needed for 5km run: " + rounds);
        }
    }
}
