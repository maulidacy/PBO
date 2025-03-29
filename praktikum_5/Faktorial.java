/*
 * Nama  : Maulida Cahya Kurnia
 * NIM   : A11.2023.15470
 */
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {

        // Memulai perhitungan faktorial
        long fak=1; int bil;
        Scanner in = new Scanner(System.in);
        
        // Input bilangan
        System.out.print("\nBilangan: ");
        bil=in.nextInt();
        
        
        for (int i = 2; i <= bil; i++) {
            System.out.print(fak + " x "+i+" = ");
            fak = fak*i;
            System.out.println(fak);
        }
        
        in.close(); // Menutup scanner
    }
}