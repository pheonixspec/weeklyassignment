import java.util.Scanner;

public class BMICalculator {
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal weight";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter data for 10 people:");
            for (int i = 1; i <= 10; i++) {
                System.out.println("\nPerson " + i);
                System.out.print("Enter weight (kg): ");
                double weight = sc.nextDouble();
                System.out.print("Enter height (m): ");
                double height = sc.nextDouble();
                
                double bmi = weight / (height * height);
                String status = getBMIStatus(bmi);
                
                System.out.println("BMI: " + bmi);
                System.out.println("Status: " + status);
            }
        }
    }
}
