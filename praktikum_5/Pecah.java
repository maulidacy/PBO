/*
 * Nama  : Maulida Cahya Kurnia 
 * NIM   : A11.2023.15470
 */
import java.util.Scanner;

public class Pecah {
    public static void main(String[] args) {
        int bil, p;
        Scanner in = new Scanner(System.in);
        
        // Input bilangan
        System.out.print("\nBilangan: "); bil = in.nextInt();

        for(int i = 1; i <= bil; i++)
        {
            System.out.print(i + " ");
            if (i % 5 == 0) 
                System.out.println(""); // Pindah baris setelah setiap kelipatan 5{}
        }

        // Menampilkan bilangan pecahan
        System.out.println("---------------");
        System.out.print("Dipecah: ");
        p = in.nextInt();
        for (int i = 1; i <= bil; i++) {
            System.out.print(i + " ");
            if (i % p == 0) {
                System.out.println(); // Pindah baris setelah setiap angka genap
            }
        }

        in.close(); // Menutup scanner
    }
}