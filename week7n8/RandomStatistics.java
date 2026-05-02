import java.util.Random;

public class RandomStatistics {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int[] numbers = new int[5];
        System.out.println("Five random 4-digit numbers:");
        
        for (int i = 0; i < 5; i++) {
            numbers[i] = 1000 + rand.nextInt(9000);
            System.out.println(numbers[i]);
        }
        
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        double average = sum / 5;
        
        System.out.println("\nAverage: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
    }
}
