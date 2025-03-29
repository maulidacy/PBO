/*
 * Nama  : Maulida Cahya Kurnia
 * NIM   : A11.2023.15470
 */
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int bil;
        Scanner in = new Scanner(System.in);
        System.out.print("\nJumlah Data: ");
        bil = in.nextInt();
        int[] nilai = new int[bil];
        
        for (int i = 0; i < bil; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            nilai[i] = in.nextInt();
        }
        for (int i = 0; i < bil; i++) {
            System.out.println("Hasil nilai[" + i + "] = " + nilai[i]);
        }
        in.close();
    }
}