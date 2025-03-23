/*
 * Nama : Maulida Cahya Kurnia 
 * NIM  : A11.2023.15470
 */

public class BicycleDemo {
    public static void main(String[] args) {
        // Membuat object
        Bicycle bike = new Bicycle();

        // memanggil atribut dan memberi nilai
        bike.speed = 10;
        bike.gear = 2;

        // Memanggil method dan menunjuk nilai parameter
        bike.speedUp(10);
        bike.changeGear(2);
    }
}