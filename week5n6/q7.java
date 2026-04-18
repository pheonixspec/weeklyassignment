import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) { System.out.println("Error"); return; }
        int[] even = new int[number/2 + 1], odd = new int[number/2 + 1];
        int eIdx = 0, oIdx = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) even[eIdx++] = i;
            else odd[oIdx++] = i;
        }
        for (int i = 0; i < eIdx; i++) System.out.print(even[i] + " ");
        System.out.println();
        for (int i = 0; i < oIdx; i++) System.out.print(odd[i] + " ");
    }
}