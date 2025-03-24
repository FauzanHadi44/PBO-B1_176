// Nama File    : Petani.java
// Deskripsi    : Berisi atribut dan method dalam class Super Petani
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 22 Maret 2025

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota(){
        return asal_kota;
    }

    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    public int hitungMasaKerja(){
        return super.hitungMasaKerja(1);
    }
}
