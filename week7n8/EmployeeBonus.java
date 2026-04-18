import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] salaries = new double[10];
            double[] bonuses = new double[10];
            
            System.out.println("Enter salary and performance (1-10) for 10 employees:");
            
            for (int i = 0; i < 10; i++) {
                System.out.print("Employee " + (i + 1) + " salary: ");
                double salary = sc.nextDouble();
                System.out.print("Performance rating: ");
                int rating = sc.nextInt();
                
                salaries[i] = salary;
                if (rating >= 8) {
                    bonuses[i] = salary * 0.05;
                } else {
                    bonuses[i] = salary * 0.02;
                }
            }
            
            System.out.println("\n=== Salary Summary Table ===");
            System.out.println("Employee\tSalary\t\tBonus\t\tTotal");
            System.out.println("=".repeat(50));
            
            double totalSalary = 0;
            double totalBonus = 0;
            
            for (int i = 0; i < 10; i++) {
                double total = salaries[i] + bonuses[i];
                totalSalary += salaries[i];
                totalBonus += bonuses[i];
                System.out.printf("%d\t\t%.2f\t%.2f\t%.2f\n", i + 1, salaries[i], bonuses[i], total);
            }
            
            System.out.println("=".repeat(50));
            System.out.printf("Total\t\t%.2f\t%.2f\t%.2f\n", totalSalary, totalBonus, totalSalary + totalBonus);
        }
    }
}
