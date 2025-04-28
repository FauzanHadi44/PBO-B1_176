// Nama File    : Burung.java
// Deskripsi    : Berisi atribut dan method dalam class Super Burung
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 23 Maret 2025

public class Burung extends Anabul{
    public Burung(String nama){
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan Terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara Cuit.");
    }
}
