import java.util.Scanner;
import java.util.ArrayList;

public class FactorTasks {
    public static ArrayList<Integer> getFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
        
        ArrayList<Integer> factors = getFactors(num);
        
        int greatestFactor = factors.get(factors.size() - 1);
        long sum = 0;
        long product = 1;
        long sumOfCubes = 0;
        
        for (int factor : factors) {
            sum += factor;
            product *= factor;
            sumOfCubes += (long) factor * factor * factor;
        }
        
        System.out.println("Factors: " + factors);
        System.out.println("Greatest factor: " + greatestFactor);
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of cubes: " + sumOfCubes);
        }
    }
}
