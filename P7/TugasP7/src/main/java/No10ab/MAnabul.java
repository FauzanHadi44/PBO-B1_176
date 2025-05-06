/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No10ab;

/**
 *
 * @author Fauzan Hadi
 */
public class MAnabul {
    public static void main(String[] args) {
        // Membuat objek-objek generik
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Amer"));
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Kuntet"));
        Datum<Burung> datumBurung = new Datum<>(new Burung("Cukuruk"));

        // Menampilkan perilaku menggunakan metode generik
        ContohMetodeGenerik controller = new ContohMetodeGenerik();

        System.out.println("===== Kucing =====");
        controller.tampilkanPerilaku(datumKucing);

        System.out.println("\n===== Anjing =====");
        controller.tampilkanPerilaku(datumAnjing);

        System.out.println("\n===== Burung =====");
        controller.tampilkanPerilaku(datumBurung);
    }
}
