/*
 * Nama  : Maulida Cahya Kurnia
 * NIM   : A11.2023.15470
 */
import java.util.Scanner;

public class Nilai {

    // Attributes
    String nim, nama, nHuruf, predikat;
    float nilaiUts, nilaiTugas, nilaiUas, pNilaiUts, pNilaiTugas, pNilaiUas, nilaiAkhir;

    Scanner input = new Scanner(System.in); // Deklarasi scanner

    // Constructor
    public Nilai(String nim, String nama, float nilaiTugas, float nilaiUts, float nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    // Default Constructor
    public Nilai() {
    }

    void inputData() {
        System.out.print("Masukkan NIM   : ");
        nim = input.nextLine();
        System.out.print("Masukkan Nama  : ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai UTS   : ");
        nilaiUts = input.nextFloat();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = input.nextFloat();
        System.out.print("Masukkan Nilai UAS   : ");
        nilaiUas = input.nextFloat();
        input.nextLine(); // Clear the buffer
        System.out.println("-------------------------");
    }

    void hitungNilai() {
        pNilaiTugas = 0.2f * nilaiTugas;
        pNilaiUts = 0.35f * nilaiUts;
        pNilaiUas = 0.45f * nilaiUas;
        nilaiAkhir = pNilaiTugas + pNilaiUts + pNilaiUas;
        nHuruf = getNilHuruf(nilaiAkhir); // Set nHuruf based on nilaiAkhir
    }

    void cetakNilai() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai UTS   : " + nilaiUts + " 20%     : " + pNilaiTugas);
        System.out.println("Nilai Tugas : " + nilaiTugas + " 35%     : " + pNilaiUts);
        System.out.println("Nilai UAS   : " + nilaiUas + " 45%     : " + pNilaiUas);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + getNilHuruf(nilaiAkhir));
        System.out.println("Predikat    : " + getPredikat(getNilHuruf(nilaiAkhir)));
        System.out.println("-------------------------");
    }

    String getNilHuruf(float nilai) {

        if (nilai >= 85) {
            nHuruf = "A";
        } else if (nilai >= 80) {
            nHuruf = "AB";
        } else if (nilai >= 70) {
            nHuruf = "B";
        } else if (nilai >= 65) {
            nHuruf = "BC";
        } else if (nilai >= 60) {
            nHuruf = "C";
        } else if (nilai >= 40) {
            nHuruf = "D";
        } else
            nHuruf = "E";
        return nHuruf; // Mengembalikan karakter
    }

    String getPredikat(String huruf) {
        switch (huruf) {
            case "A":
                predikat = "Apik";
                break;
            case "AB":
                predikat = "Apik Baik";
                break;
            case "B":
                predikat = "Baik";
                break;
            case "BC":
                predikat = "Baik Cukup";
                break;
            case "C":
                predikat = "Cukup";
                break;
            case "D":
                predikat = "Dablek";
                break;
            default:
                predikat = "Elek";
        }
        return predikat;
    }

    void judul() {
        System.out.println("Daftar Nilai PBO");
        System.out.println("-------------------------");
        System.out.println("Nim\tNama\tN.Tgs\tN.Uts\tN.Uas\tN.Akhir" + "\tN.Huruf\tPredikat");
    }

    void daftarNilai() {
        System.out.println(nim + "\t" + nama + "\t" + nilaiTugas + "\t" + nilaiUts + "\t" + nilaiUas + "\t" + nilaiAkhir
                + "\t" + nHuruf + "\t" + predikat);
    }
}
