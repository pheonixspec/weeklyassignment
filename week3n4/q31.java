import java.util.Scanner;

public class q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(), c = sc.nextInt(), m = sc.nextInt();
        double avg = (p + c + m) / 3.0;
        String grade, remarks;

        if (avg >= 80) { grade = "A"; remarks = "Level 4, above expectations"; }
        else if (avg >= 70) { grade = "B"; remarks = "Level 3, meets expectations"; }
        else if (avg >= 60) { grade = "C"; remarks = "Level 2, below expectations"; }
        else if (avg >= 50) { grade = "D"; remarks = "Level 1, well below expectations"; }
        else if (avg >= 40) { grade = "E"; remarks = "Level 1-, too below expectations"; }
        else { grade = "R"; remarks = "Remedial standard"; }

        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}