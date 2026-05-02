import java.util.Scanner;

public class q21 {
    public static String[][] calculateBmi(String[][] measurements) {
        String[][] result = new String[measurements.length][4];

        for (int i = 0; i < measurements.length; i++) {
            double weight = Double.parseDouble(measurements[i][0]);
            double heightCm = Double.parseDouble(measurements[i][1]);
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;

            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.format("%.2f", weight);
            result[i][1] = String.format("%.2f", heightCm);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-8s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (String[] row : data) {
            System.out.printf("%-8s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[][] measurements = new String[10][2];

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter weight in kg for person " + (i + 1) + ": ");
                measurements[i][0] = String.valueOf(sc.nextDouble());
                System.out.print("Enter height in cm for person " + (i + 1) + ": ");
                measurements[i][1] = String.valueOf(sc.nextDouble());
            }

            displayTable(calculateBmi(measurements));
        }
    }
}