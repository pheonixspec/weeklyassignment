import java.util.Scanner;

public class q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pounds: ");
        double lbs = input.nextDouble();
        
        double kg = lbs * 2.2; 
        
        System.out.println("The weight of the person in pound is " + lbs + " and in kg is " + kg);
    }
}