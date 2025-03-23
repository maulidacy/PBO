/*
 * Nama : Maulida Cahya Kurnia 
 * NIM  : A11.2023.15470
 */

public class TestStatic1 {

    /*
     * Buatlah class baru TestStatic1, panggil method satu(), dua() dan cetak kembali attribute a-e, perhatikan hasilnya
     */
    
    public static void main(String[] args) {
        // Membuat objek dari kelas TestStatic
        TestStatic obj = new TestStatic();

        // Memanggil method satu() dan dua()
        obj.satu();
        TestStatic.dua();

        // Mencetak atribut a hingga e
        System.out.println("a : " + obj.a);
        System.out.println("b : " + TestStatic.b);
        System.out.println("c : " + obj.c);
        System.out.println("d : " + obj.d);
        // System.out.println("e : " + obj.e); --> error karena e private
    }
}