// Nama File    : MAnabul.java
// Deskripsi    : Berisi Main dalam class Main
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 23 Maret 2025

import java.util.ArrayList;

public class MAnabul {
    public static void main(String[] args) {
        Anabul anabul2 = new Anjing("Amer");
        Anabul anabul3 = new Burung("Cukuruk");
        Anabul anabul1 = new Kucing("Kuntet");

        ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(anabul1);
        anabuls.add(anabul2);
        anabuls.add(anabul3);

        System.out.println("===== Informasi Anabul =====");

        for (Anabul a : anabuls) {
            System.out.println("===== " + a.getClass().getSimpleName() + " =====");
            System.out.println("Nama: " + a.nama);
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}
