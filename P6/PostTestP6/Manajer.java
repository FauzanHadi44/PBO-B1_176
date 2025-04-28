// Nama File    : Manajer.java
// Deskripsi    : Berisi atribut dan method dalam class Manajer
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 22 April 2025

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
