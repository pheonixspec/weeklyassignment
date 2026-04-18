import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpring(int month, int day) {
        if (month == 3 && day >= 20) return true;
        if (month == 4 || month == 5) return true;
        return month == 6 && day <= 20;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter month (1-12): ");
            int month = sc.nextInt();
            System.out.print("Enter day (1-31): ");
            int day = sc.nextInt();
            
            if (isSpring(month, day)) {
                System.out.println("It is Spring season");
            } else {
                System.out.println("It is not Spring season");
            }
        }
    }
}
