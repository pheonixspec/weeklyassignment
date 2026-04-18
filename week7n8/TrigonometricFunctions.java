import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter angle in degrees: ");
            double degrees = sc.nextDouble();
            
            double radians = Math.toRadians(degrees);
            
            double sine = Math.sin(radians);
            double cosine = Math.cos(radians);
            double tangent = Math.tan(radians);
            
            System.out.println("Angle in radians: " + radians);
            System.out.println("sin(" + degrees + "°) = " + sine);
            System.out.println("cos(" + degrees + "°) = " + cosine);
            System.out.println("tan(" + degrees + "°) = " + tangent);
        }
    }
}
