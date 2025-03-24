// Nama File    : Pengusaha.java
// Deskripsi    : Berisi atribut dan method dalam class Super Pengusaha
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 22 Maret 2025

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return npwp;
    }

    public void getNpwp(String npwp){
        this.npwp = npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    public int hitungMasaKerja(){
        return super.hitungMasaKerja(7);
    }
}
