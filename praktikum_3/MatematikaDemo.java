/*
 * Nama : Maulida Cahya Kurnia 
 * NIM  : A11.2023.15470
 */

public class MatematikaDemo {

    /*
     * Buat Class bernama MatematikaDemo, yang mengeksekusi method dan menampilkan: 
     * Pertambahan: 221 + 9 = 230
     * Pengurangan: 221 - 9 = 212 
     * Perkalian: 221 x 9 = 1989
     * Pembagian: 221 / 9 = 24
     * 
     * Tambahkan method berikut pada class Matematika yang mampu menampung data pecahan : 
     * pertambahan 
     * pengurangan 
     * perkalian 
     * pembagian 
     */

    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        Matematika mtk1 = new Matematika(357, 73);

        mtk.a=221;mtk.b=9;;
        mtk.pertambahan();
        mtk.pengurangan();
        mtk.perkalian();
        mtk.pembagian();
        mtk1.pertambahan();
        mtk1.pengurangan();
        mtk1.perkalian();
        mtk1.pembagian();

        Matematika mtk2=new Matematika();
        mtk2.pertambahan(777.79f, 55.7f);
        mtk2.pengurangan(777.79f, 55.7f);
        mtk2.perkalian(777.79f, 55.7f);
        mtk2.pembagian(777.79f, 55.7f);
        mtk2.pertambahan(12.5, 28.7, 14.2);

    }
}