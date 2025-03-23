/*
 * Nama : Maulida Cahya Kurnia 
 * NIM  : A11.2023.15470
 */

import java.util.Scanner;

public class KonversiSuhu {

    /*
     * Buatlah program konversi suhu, dari Celcius dengan ketentuan
     * Kelvin: Menggunakan formula °K = °C + 273.15
     * Fahrenheit: Menggunakan formula °F = °C × 1.8 + 32
     * Rankine: Menggunakan formula °Ra = °C × 1.8 + 491.67
     * Delisle: Menggunakan formula °De = (100 – °C) × 1.5
     * Newton: Menggunakan formula °N= °C × 33/100
     * Réaumur: Menggunakan formula °Ré = °C × 0.8
     * Romer: Menggunakan formula °Ro = °C × 21/40 + 7.5
     */

    int c;
    float hasil;
    Scanner key = new Scanner(System.in);

    public KonversiSuhu() {
    }

    public KonversiSuhu(int c) {
        this.c = c;
    }

    void inputC() {
        System.out.print("input C: ");
        c = key.nextInt();
    }

    void cToK() {
        hasil = c + 273.15f;
        System.out.println(c + "C  " + hasil + "K");
    }

    void cToK(int c) {
        hasil = c + 273.15f;
        System.out.println(c + "C  " + hasil + "K");
    }

    float cToK(float c) {
        return c + 273.15f;
    }

    // fahrenheit ------------------------

    void cToF() {
        hasil = c * 1.8f + 32f;
        System.out.println(c + "C  " + hasil + "F");
    }

    void cToF(int c) {
        hasil = c * 1.8f + 32f;
        System.out.println(c + "C  " + hasil + "F");
    }

    float cToF(float c) {
        return c * 1.8f + 32f;
    }

    // rankine ------------------------

    void cToR() {
        hasil = c * 1.8f + 491.67f;
        System.out.println(c + "C  " + hasil + "R");
    }

    void cToR(int c) {
        hasil = c * 1.8f + 32f + 491.67f;
        System.out.println(c + "C  " + hasil + "R");
    }

    float cToR(float c) {
        return c * 1.8f + 32f + 491.67f;
    }

    // delisle ------------------------

    void cToD() {
        hasil = (100 - c) * 1.5f;
        System.out.println(c + "C  " + hasil + "D");
    }

    void cToD(int c) {
        hasil = (100 - c) * 1.5f;
        System.out.println(c + "C  " + hasil + "D");
    }

    float cToD(float c) {
        return (100 - c) * 1.5f;
    }

    // Newton ------------------------

    void cToN() {
        hasil = c * (33.0f / 100.0f);
        System.out.println(c + "C  " + hasil + "N");
    }

    void cToN(int c) {
        hasil = c * (33.0f / 100.0f);
        System.out.println(c + "C  " + hasil + "N");
    }

    float cToN(float c) {
        return c * (33.0f / 100.0f);
    }

    // Reaumur ------------------------

    void cToRe() {
        hasil = c * 0.8f;
        System.out.println(c + "C  " + hasil + "Re");
    }

    void cToRe(int c) {
        hasil = c * 0.8f;
        System.out.println(c + "C  " + hasil + "Re");
    }

    float cToRe(float c) {
        return c * 0.8f;
    }

    // Romer ------------------------

    void cToRo() {
        hasil = c * 21.0f / 40.0f + 7.5f;
        System.out.println(c + "C  " + hasil + "Ro");
    }

    void cToRo(int c) {
        hasil = c * 21.0f / 40.0f + 7.5f;
        System.out.println(c + "C  " + hasil + "Ro");
    }

    float cToRo(float c) {
        return c * 21.0f / 40.0f + 7.5f;
    }
}
