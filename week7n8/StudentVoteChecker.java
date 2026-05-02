import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int canVote = 0;
            System.out.println("Enter ages of 10 students:");
            
            for (int i = 1; i <= 10; i++) {
                System.out.print("Student " + i + " age: ");
                int age = sc.nextInt();
                if (age >= 18) {
                    canVote++;
                }
            }
            
            System.out.println("Students who can vote: " + canVote);
            System.out.println("Students who cannot vote: " + (10 - canVote));
        }
    }
}
