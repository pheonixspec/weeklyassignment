import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter the base of the triangle (cm): ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle (cm): ");
        double height = input.nextDouble();
  
        double areaSqCm = 0.5 * base * height;
  
        double areaSqIn = areaSqCm / (2.54 * 2.54);
      
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", 
                          areaSqIn, areaSqCm);
        
        input.close();
    }
}