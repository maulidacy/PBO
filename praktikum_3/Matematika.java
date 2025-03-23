/*
 * Nama : Maulida Cahya Kurnia 
 * NIM  : A11.2023.15470
 */

public class Matematika {

    /*
     * Buat Class bernama Matematika, yang berisi method:
     * pertambahan
     * pengurangan
     * perkalian
     * pembagian
     */

    int a, b, hasil;
    double hsl;

    public Matematika() {
    }

    public Matematika(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method untuk pertambahan bilangan bulat dan pecahan
    void pertambahan() {
        hasil = a + b;
        System.out.println("pertambahan : " + a + " + " + b + " = " + hasil);
    }

    void pengurangan() {
        hasil = a - b;
        System.out.println("pengurangan : " + a + " - " + b + " = " + hasil);
    }

    void perkalian() {
        hasil = a * b;
        System.out.println("perkalian : " + a + " * " + b + " = " + hasil);
    }

    void pembagian() {
        hasil = a / b;
        System.out.println("pembagian : " + a + " / " + b + " = " + hasil);
    }

    void pertambahan(float a, float b) {
        hsl = a + b;
        System.out.println("pembagian : " + a + " + " + b + " = " + hsl);
    }

    void pengurangan(float a, float b) {
        hsl = a - b;
        System.out.println("pengurangan : " + a + " - " + b + " = " + hsl);
    }

    void perkalian(float a, float b) {
        hsl = a * b;
        System.out.println("perkalian : " + a + " * " + b + " = " + hsl);
    }

    void pembagian(float a, float b) {
        hsl = a / b;
        System.out.println("pembagian : " + a + " / " + b + " = " + hsl);
    }

    void pertambahan(double a, double b, double c) {
        hsl = a + b + c;
        System.out.println("pertambahan : " + a + " + " + b + " + " + c + " = " + hsl);
    }
}
