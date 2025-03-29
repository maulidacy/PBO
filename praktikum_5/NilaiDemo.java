/*
 * Nama  : Maulida Cahya Kurnia
 * NIM   : A11.2023.15470
 */
import java.util.Scanner;
public class NilaiDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nJumlah Mahasiswa: ");
        int n = input.nextInt();
        input.nextLine();

        Nilai[] nilaibyk = new Nilai[n]; // Array of objects

        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa Ke: " + (i + 1));
            Nilai nilaimu= new Nilai();
            nilaibyk[i] = new Nilai();
            nilaibyk[i].inputData();
            nilaibyk[i].hitungNilai();
            nilaibyk[i].cetakNilai();
        }
        nilaibyk[0].judul(); 
        for (int i = 0; i < n; i++) {
            nilaibyk[i].daftarNilai();
        }
    }
}

/*import java.util.Scanner;
import java.util.Arrays;

public class NilaiDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawab = "";
        
        // Inisialisasi array dengan ukuran awal
        Nilai[] nilaibyk = new Nilai[1]; // Array awal kecil
        int totalMahasiswa = 0;
        
        do {
            System.out.println("-------------------------");
            System.out.print("Jumlah Mahasiswa yang akan ditambahkan: ");
            int n = input.nextInt();
            input.nextLine(); // Clear buffer
            
            // Resize array jika diperlukan
            if (totalMahasiswa + n > nilaibyk.length) {
                nilaibyk = Arrays.copyOf(nilaibyk, nilaibyk.length + n);
            }
            
            // Input data mahasiswa baru
            for (int i = 0; i < n; i++) {
                System.out.println("Mahasiswa ke-" + (totalMahasiswa + 1) + " :");
                nilaibyk[totalMahasiswa] = new Nilai();
                nilaibyk[totalMahasiswa].inputData();
                nilaibyk[totalMahasiswa].hitungNilai();
                nilaibyk[totalMahasiswa].cetakNilai();
                totalMahasiswa++;
            }
            
            // Cetak semua data yang ada
            if (totalMahasiswa > 0) {
                nilaibyk[0].judul();
                for (int i = 0; i < totalMahasiswa; i++) {
                    nilaibyk[i].daftarNilai();
                }
            }
            System.out.println("-------------------------");
            
            System.out.print("Input data lagi [Y/T]? ");
            jawab = input.nextLine().trim();
        } while (jawab.equalsIgnoreCase("Y"));
        
        input.close();
    }
} */