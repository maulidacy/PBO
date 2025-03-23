/*
 * NIM  : A11.2023.15470
 * Nama : Maulida Cahya Kurnia
 */
public class MyVarFloat {
    /*
     * menghitung luas dan keliling persegi, segitiga, lingkaran, dan kubus
     */
    public static void main(String[] args) {

        System.out.println("==================== Soal 1 : Persegi ====================");

        int SisiPersegi = 10;

        float LuasPersegi = SisiPersegi * SisiPersegi;
        float KelilingPersegi = 4 * SisiPersegi;

        System.out.println("Sisi                : " + SisiPersegi + " cm");
        System.out.println("Luas Persegi        : " + LuasPersegi + " cm");
        System.out.println("Keliling Persegi    : " + KelilingPersegi + " cm");
        System.out.println();

        System.out.println("==================== Soal 2 : Segitiga ====================");

        int Sisi1 = 10;
        int Sisi2 = 10;
        float Sisi3 = 5;
        int AlasSegitiga = 10;
        int TinggiSegitiga = 8;

        float LuasSegitiga = (AlasSegitiga * TinggiSegitiga) / 2;
        float KelilingSegitiga = Sisi1 + Sisi2 + Sisi3;

        System.out.println("Sisi 1            : " + Sisi1 + " cm");
        System.out.println("Sisi 2            : " + Sisi2 + " cm");
        System.out.println("Sisi 3            : " + Sisi3 + " cm");
        System.out.println("Luas Segitiga     : " + LuasSegitiga + " cm");
        System.out.println("Keliling Segitiga : " + KelilingSegitiga + " cm");
        System.err.println();

        System.out.println("==================== Soal 3 : Lingkaran ====================");

        float PhiLingkaran = 3.14f;
        int JariJariLingkaran = 10;

        float LuasLingkaran = PhiLingkaran * (JariJariLingkaran * JariJariLingkaran);
        float KelilingLingkaran = 2 * PhiLingkaran * JariJariLingkaran;

        System.out.println("Phi                 : " + PhiLingkaran + " cm");
        System.out.println("Jari-jari           : " + JariJariLingkaran + " cm");
        System.out.println("Luas Lingkaran      : " + LuasLingkaran + " cm2");
        System.out.println("Keliling Lingkaran  : " + KelilingLingkaran + " cm");
        System.out.println();

        System.out.println("==================== Soal 4 : Kubus ====================");

        int SisiKubus = 10;

        float KelilingKubus = 12 * SisiKubus;
        float LuasKubus = SisiKubus * SisiKubus * 6;

        System.out.println("Sisi             : " + SisiKubus + " cm");
        System.out.println("Luas Kubus       : " + LuasKubus + " cm2");
        System.out.println("Keliling Kubus   : " + KelilingKubus + " cm");
    }
}

// ============= Soal 1 : Persegi =============
/*
 * public class MyVarFloat {
 * public static void main(String[] args) {
 * 
 * int sisi = 10;
 * float luas = sisi * sisi;
 * float keliling = 4 * sisi;
 * 
 * System.out.println("Sisi       : " + sisi);
 * System.out.println("Luas       : " + luas);
 * System.out.println("Keliling   : " + keliling);
 * }
 * }
 */

// ============= Soal 2 : Segitiga =============
/*
 * public class MyVarFloat {
 * public static void main(String[] args) {
 * 
 * int alas = 10;
 * int tinggi = 8;
 * int sisiA = 7;
 * int sisiB = 5;
 * int sisiC = 7;
 * 
 * float luas = (alas * tinggi) / 2;
 * double keliling = sisiA + sisiB + sisiC;
 * 
 * 
 * System.out.println("Alas       : " + alas);
 * System.out.println("Tinggi     : " + tinggi);
 * System.out.println("Luas       : " + luas);
 * System.out.println("Keliling   : " + keliling);
 * }
 * }
 */

/*
 * //============= Soal 3 : Lingkaran =============
 * public class MyVarFloat {
 * public static void main(String[] args) {
 * 
 * float phi = 3.14f;
 * int r = 10;
 * float luas = phi * (r * r);
 * float keliling = 2 * phi * r;
 * 
 * System.out.println("Phi        : " + phi);
 * System.out.println("Jari-jari  : " + r);
 * System.out.println("Luas       : " + luas);
 * System.out.println("Keliling   : " + keliling);
 * }
 * }
 */

/*
 * //============= Soal 4 : Kubus =============
 * public class MyVarFloat {
 * public static void main(String[] args) {
 * float panjang = 10.5f;
 * float lebar = 10.5f;
 * float tinggi = 10.5f;
 * float volume = panjang * lebar * tinggi;
 * float luas = 2 * (panjang * lebar + lebar * tinggi + panjang * tinggi);
 * 
 * System.out.println("Panjang     : " + panjang);
 * System.out.println("Lebar       : " + lebar);
 * System.out.println("Tinggi      : " + tinggi);
 * System.out.println("Volume      : " + volume);
 * System.out.println("Luas        : " + luas);
 * }
 * }
 */
