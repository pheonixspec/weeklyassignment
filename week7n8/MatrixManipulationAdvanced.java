import java.util.Random;

public class MatrixManipulationAdvanced {
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    
    public static double determinant(double[][] matrix) {
        int n = matrix.length;
        
        if (n == 1) {
            return matrix[0][0];
        }
        
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        
        double det = 0;
        for (int j = 0; j < n; j++) {
            det += Math.pow(-1, j) * matrix[0][j] * determinant(getMinor(matrix, 0, j));
        }
        return det;
    }
    
    public static double[][] getMinor(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        int minorRow = 0;
        
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            int minorCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                minor[minorRow][minorCol] = matrix[i][j];
                minorCol++;
            }
            minorRow++;
        }
        return minor;
    }
    
    public static double[][] inverseMatrix(double[][] matrix) {
        double det = determinant(matrix);
        if (Math.abs(det) < 1e-9) {
            System.out.println("Matrix is singular and cannot be inverted");
            return null;
        }
        
        int n = matrix.length;
        double[][] adjugate = new double[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double[][] minor = getMinor(matrix, i, j);
                adjugate[j][i] = Math.pow(-1, i + j) * determinant(minor) / det;
            }
        }
        return adjugate;
    }
    
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        double[][] matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        System.out.println("\nTranspose:");
        printMatrix(transposeMatrix(matrix));
        
        double det = determinant(matrix);
        System.out.println("\nDeterminant: " + det);
        
        System.out.println("\nInverse:");
        double[][] inverse = inverseMatrix(matrix);
        if (inverse != null) {
            printMatrix(inverse);
        }
    }
}
