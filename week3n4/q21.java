import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt(), h1 = sc.nextInt();
        int age2 = sc.nextInt(), h2 = sc.nextInt();
        int age3 = sc.nextInt(), h3 = sc.nextInt();

        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(h1, Math.max(h2, h3));

        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest);
    }
}