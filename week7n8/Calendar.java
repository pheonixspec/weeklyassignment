import java.util.Scanner;

public class Calendar {
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        
        int q = 1;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        
        int h = (q + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 - 2 * j) % 7;
        h = (h + 6) % 7;
        
        return h;
    }
    
    public static int getDaysInMonth(int month, int year) {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            return 29;
        }
        
        return days[month - 1];
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter month (1-12): ");
            int month = sc.nextInt();
            System.out.print("Enter year: ");
            int year = sc.nextInt();
        
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
                              "July", "August", "September", "October", "November", "December"};
        String[] dayNames = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        
        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);
        
        System.out.println("\n" + monthNames[month] + " " + year);
        System.out.println("==========================");
        
        for (String day : dayNames) {
            System.out.print(day + " ");
        }
        System.out.println();
        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        }
    }
}
