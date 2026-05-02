import java.util.Scanner;
import java.util.ArrayList;

public class NumberCheckerDivisorBased {
    public static ArrayList<Integer> getProperDivisors(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
    
    public static int sumOfDivisors(ArrayList<Integer> divisors) {
        int sum = 0;
        for (int d : divisors) {
            sum += d;
        }
        return sum;
    }
    
    public static boolean isPerfect(int num) {
        ArrayList<Integer> divisors = getProperDivisors(num);
        return sumOfDivisors(divisors) == num;
    }
    
    public static boolean isAbundant(int num) {
        ArrayList<Integer> divisors = getProperDivisors(num);
        return sumOfDivisors(divisors) > num;
    }
    
    public static boolean isDeficient(int num) {
        ArrayList<Integer> divisors = getProperDivisors(num);
        return sumOfDivisors(divisors) < num;
    }
    
    public static boolean isStrong(int num) {
        String numStr = String.valueOf(num);
        int sum = 0;
        for (char c : numStr.toCharArray()) {
            int digit = Character.getNumericValue(c);
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
        }
        return sum == num;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
        
        System.out.println("Is Perfect: " + isPerfect(num));
        System.out.println("Is Abundant: " + isAbundant(num));
        System.out.println("Is Deficient: " + isDeficient(num));
        System.out.println("Is Strong: " + isStrong(num));
        }
    }
}
