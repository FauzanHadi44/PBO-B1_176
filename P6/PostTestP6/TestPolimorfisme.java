// Nama File    : TestPolimorfisme.java
// Deskripsi    : Berisi Main dalam class Main
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 22 April 2025

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai4 = new Manajer("Ahmad");

        Manajer pegawai3 = new Manajer("Argo");
        Manajer pegawai5 = new Manajer("Udin");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);
        emps.add(pegawai4);
        emps.add(pegawai5);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}
