/*
 * Nama  : Maulida Cahya Kurnia
 * NIM   : A11.2023.15470
 */
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i, j, n, m;

        // Input untuk matriks A
        System.out.print("\nInput baris matriks A = ");
        n = in.nextInt();
        System.out.print("Input kolom matriks A = ");
        m = in.nextInt();
        int[][] matrixA = new int[n][m]; // Deklarasi matriks A

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("Input elemen matriks A [" + i + "," + j + "] = ");
                matrixA[i][j] = in.nextInt();
            }
        }
        System.out.println("Matriks A = ");
        printMatrix(matrixA);

        // Input untuk matriks B
        System.out.print("\nInput baris matriks B = ");
        int rowsB = in.nextInt();
        System.out.print("Input kolom matriks B = ");
        int colsB = in.nextInt();
        int[][] matrixB = new int[rowsB][colsB]; // Deklarasi matriks B

        for (i = 0; i < rowsB; i++) {
            for (j = 0; j < colsB; j++) {
                System.out.print("Input elemen matriks B [" + i + "," + j + "] = ");
                matrixB[i][j] = in.nextInt();
            }
        }
        System.out.println("Matriks B = ");
        printMatrix(matrixB);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Penjumlahan Matriks");
            System.out.println("2. Perkalian Matriks");
            System.out.println("3. Transpos Matriks C (Hasil Penjumlahan)");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1/2/3/4): ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    if (n == rowsB && m == colsB) {
                        int[][] sumResult = addMatrices(matrixA, matrixB);
                        System.out.println("Hasil penjumlahan matriks A dan B:");
                        printMatrix(sumResult);
                    } else {
                        System.out.println("Matriks A dan B tidak dapat dijumlahkan (ukuran berbeda).");
                    }
                    break;
                case 2:
                    if (m == rowsB) {
                        int[][] productResult = multiplyMatrices(matrixA, matrixB);
                        System.out.println("Hasil perkalian matriks A dengan B:");
                        printMatrix(productResult);
                    } else {
                        System.out.println("Matriks A dan B tidak dapat dikalikan (ukuran tidak sesuai).");
                    }
                    break;
                case 3:
                    if (n == rowsB && m == colsB) {
                        int[][] sumResult = addMatrices(matrixA, matrixB);
                        int[][] transposedMatrix = transposeMatrix(sumResult);
                        System.out.println("Hasil transpos matriks C (Hasil Penjumlahan):");
                        printMatrix(transposedMatrix);
                    } else {
                        System.out.println("Matriks A dan B tidak dapat dijumlahkan (ukuran berbeda).");
                    }
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (choice != 4);

        in.close();
    }

    // Method untuk menjumlahkan matriks
    private static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method untuk mengalikan matriks
    private static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method untuk transpos matriks
    private static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Method untuk mencetak matriks
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}