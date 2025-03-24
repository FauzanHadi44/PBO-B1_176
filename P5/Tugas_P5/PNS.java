// Nama File    : PNS.java
// Deskripsi    : Berisi atribut dan method dalam class Super PNS
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 22 Maret 2025

public class PNS extends Manusia implements Pajak{ 
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public double hitungPajak(){
        return 0.1 * pendapatan;
    }

    public int hitungMasaKerja(){
        return super.hitungMasaKerja(6);
    }
}