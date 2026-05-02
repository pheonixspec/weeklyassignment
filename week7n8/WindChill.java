import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter temperature (Celsius): ");
            double t = sc.nextDouble();
            System.out.print("Enter wind speed (km/h): ");
            double v = sc.nextDouble();
            
            double windChill = 13.12 + 0.6215 * t - 11.37 * Math.pow(v, 0.16) + 0.3965 * t * Math.pow(v, 0.16);
            
            System.out.println("Wind Chill: " + windChill);
        }
    }
}
