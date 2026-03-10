import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Enter the total Student Fee: ");
        double fee = input.nextDouble();
    
        System.out.print("Enter the University Discount percentage (e.g., 15 for 15%): ");
        double discountPercent = input.nextDouble();
   
        double discountAmount = fee * (discountPercent / 100);
     
        double finalFee = fee - discountAmount;
 
        System.out.println("------------------------------------");
        System.out.println("Original Fee: " + fee);
        System.out.println("Discount Applied: " + discountAmount);
        System.out.println("The fee you have to pay is: " + finalFee);
        System.out.println("------------------------------------");
        
        input.close();
    }
}