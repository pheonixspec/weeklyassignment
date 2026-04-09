import java.util.Scanner;

public class q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightLbs = input.nextDouble();
        
        // Using the hint: 1 pound = 2.2 kg
        double weightKg = weightLbs * 2.2;
        
        System.out.println("The weight of the person in pounds is " + weightLbs + " and in kg is " + weightKg);
    }
}