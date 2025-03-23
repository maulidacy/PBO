/*
 * Nama : Maulida Cahya Kurnia 
 * NIM  : A11.2023.15470
 */

public class KonversiSuhuDemo {
    public static void main(String[] args) {
        KonversiSuhu konversiku = new KonversiSuhu();
        KonversiSuhu konversimu = new KonversiSuhu(37);
        konversiku.c=36;
        // konversiku
        konversiku.cToK();
        konversiku.cToF();
        konversiku.cToR();
        konversiku.cToD();
        konversiku.cToN();
        konversiku.cToRe();
        konversiku.cToRo();
        
        // konversimu
        konversimu.cToK();
        konversimu.cToF();
        konversimu.cToR();
        konversimu.cToD();
        konversimu.cToN();
        konversimu.cToRe();
        konversimu.cToRo();
        System.out.println();

        // konversi input
        konversimu.inputC();
        konversimu.cToK();
        konversimu.cToF();
        konversimu.cToR();
        konversimu.cToD();
        konversimu.cToN();
        konversimu.cToRe();
        konversimu.cToRo();

        // Menggunakan suhu 38.5 derajat Celsius
        System.out.println();
        System.out.println("Celcius ke Kelvin : " + konversimu.cToK(38.5f) + "K");
        System.out.println("Celcius ke Fahrenheit : " + konversimu.cToF(38.5f) + "F");
        System.out.println("Celcius ke Rankine : " + konversimu.cToR(38.5f) + "R");
        System.out.println("Celcius ke Delisle : " + konversimu.cToD(38.5f) + "D");
        System.out.println("Celcius ke Newton : " + konversimu.cToN(38.5f) + "N");
        System.out.println("Celcius ke Reaumur : " + konversimu.cToRe(38.5f) + "Re");
        System.out.println("Celcius ke Romer : " + konversimu.cToRo(38.5f) + "Ro");
    }
}