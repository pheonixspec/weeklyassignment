import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter double a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter double b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter double c: ");
        double c = input.nextDouble();
     
        double res1 = a + b * c;
        double res2 = a * b + c;
        double res3 = c + a / b;
        double res4 = a % b + c;
       
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + res1);
        System.out.println("a * b + c = " + res2);
        System.out.println("c + a / b = " + res3);
        System.out.println("a % b + c = " + res4);
        
        input.close();
    }
}