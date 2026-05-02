import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;
        
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
    }
}