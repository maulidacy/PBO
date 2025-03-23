/*
 * Nama : Maulida Cahya Kurnia
 * NIM :  A11.2023.15470
 */
public class InputNilai {

    /*
     * menghitung nilai, diketahui :
     * Atribut :
     * nim
     * nama
     * nilaiUts
     * nilaiTugas
     * nilaiUas
     * pNilaiUts -> 20% dari nilaiUts
     * pNilaiTugas -> 35% dari nilaiTugas
     * pNilaiUas -> 45% dari nilaiUas
     * nilaiAkhir
     * Method :
     * hitungNilai
     * cetakNilai
     */

    // Attributes
    String nim, nama;
    float nilaiUts, nilaiTugas, nilaiUas, pNilaiUts, pNilaiTugas, pNilaiUas, nilaiAkhir;

    void hitungNilai() {
        pNilaiTugas = 0.2f * nilaiTugas;
        pNilaiUts = 0.35f * nilaiUts;
        pNilaiUas = 0.45f * nilaiUas;
        nilaiAkhir = pNilaiTugas + pNilaiUts + pNilaiUas;
    }

    void cetakNilai() {

        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai UTS   : " + nilaiUts + " 20%     : " + pNilaiTugas);
        System.out.println("Nilai Tugas : " + nilaiTugas + " 35%     : " + pNilaiUts);
        System.out.println("Nilai UAS   : " + nilaiUas + " 45%     : " + pNilaiUas);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}