import java.util.Scanner;

public class EuclideanGeometry {
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter point 1 (x1, y1): ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            
            System.out.print("Enter point 2 (x2, y2): ");
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            
            double distance = getDistance(x1, y1, x2, y2);
            
            if (Math.abs(x2 - x1) < 1e-9) {
                System.out.println("Distance: " + distance);
                System.out.println("Line equation: x = " + x1);
            } else {
                double m = (y2 - y1) / (x2 - x1);
                double b = y1 - m * x1;
                
                System.out.println("Distance: " + distance);
                System.out.printf("Line equation: y = %.2fx + %.2f\n", m, b);
            }
        }
    }
}
