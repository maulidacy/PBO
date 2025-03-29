/*
 * Nama  : Maulida Cahya Kurnia
 * NIM   : A11.2023.15470
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nMasukkan jumlah data: ");
        int jumlahData = scanner.nextInt();

        ArrayList<Integer> nilai1 = new ArrayList<>();
        ArrayList<Integer> nilai2 = new ArrayList<>();
        ArrayList<Integer> jumlah = new ArrayList<>();
        ArrayList<Integer> pengurangan = new ArrayList<>();
        ArrayList<Integer> perkalian = new ArrayList<>();
        ArrayList<Integer> pembagian = new ArrayList<>();

        // Input nilai1
        System.out.println("Input nilai 1:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai1.add(scanner.nextInt());
        }

        // Input nilai2
        System.out.println("\nInput nilai 2:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai2.add(scanner.nextInt());
        }

        // Operasi
        for (int i = 0; i < jumlahData; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
            pengurangan.add(nilai1.get(i) - nilai2.get(i));
            perkalian.add(nilai1.get(i) * nilai2.get(i));
            // Pastikan tidak terjadi pembagian dengan nol
            if (nilai2.get(i) != 0) {
                pembagian.add(nilai1.get(i) / nilai2.get(i));
            } else {
                pembagian.add(0); // Atau bisa ditangani dengan cara lain
                System.out.println("Pembagian dengan nol pada index ke-" + i);
            }
        }

        // Menampilkan hasil
        System.out.println("\nHasil Jumlah:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Jumlah index ke-" + i + " = " + jumlah.get(i));
        }

        System.out.println("\nHasil Pengurangan:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Pengurangan index ke-" + i + " = " + pengurangan.get(i));
        }

        System.out.println("\nHasil Perkalian:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Perkalian index ke-" + i + " = " + perkalian.get(i));
        }

        System.out.println("\nHasil Pembagian:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Pembagian index ke-" + i + " = " + pembagian.get(i));
        }

        scanner.close();
    }
}