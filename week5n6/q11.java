import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10], years = new double[10], newSalary = new double[10], bonus = new double[10];
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            double s = sc.nextDouble(), y = sc.nextDouble();
            if (s <= 0 || y < 0) { i--; continue; }
            salary[i] = s; years[i] = y;
            bonus[i] = (y > 5) ? s * 0.05 : s * 0.02;
            newSalary[i] = s + bonus[i];
            totalOld += s; totalBonus += bonus[i]; totalNew += newSalary[i];
        }
        System.out.println("Total Old: " + totalOld + " Bonus: " + totalBonus + " New: " + totalNew);
    }
}