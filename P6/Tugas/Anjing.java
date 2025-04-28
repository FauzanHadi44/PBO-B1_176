// Nama File    : Anjing.java
// Deskripsi    : Berisi atribut dan method dalam class Super Anjing
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 23 Maret 2025

public class Anjing extends Anabul {
    public Anjing(String nama){
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan Melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara Guk-guk.");
    }
}
