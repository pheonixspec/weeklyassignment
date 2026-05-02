import java.util.Scanner;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int[] result = new int[2];
        int[] arr = {a, b, c};
        
        int min = arr[0];
        int max = arr[0];
        
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        result[0] = min;
        result[1] = max;
        return result;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.print("Enter third number: ");
            int c = sc.nextInt();
            
            int[] result = findSmallestAndLargest(a, b, c);
            System.out.println("Smallest: " + result[0]);
            System.out.println("Largest: " + result[1]);
        }
    }
}
