// Nama File    : Pajak.java
// Deskripsi    : Berisi Main dalam class Main Manusia
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 22 Maret 2025

public class MManusia {
    public static void main(String[] args){
        PNS p1 = new PNS("Satriyo", "01-04-2006", "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", "01-01-2000", "Jl. Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        PNS p2 = new PNS("Panji", "01-04-2010", "Jl. Panorama 111 Tembalang", 10000000, "198004212010041002");
        
        System.out.println("=============== Informasi ===============");
        System.out.println("Jumlah Manusia      = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS          = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha    = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani       = " + Petani.getCounterPetani());
        System.out.println("Pajak PNS p1        = Rp. " + String.format("%,.2f", p1.hitungPajak()));
        System.out.println("Pajak Pengusaha pe1 = Rp. " + String.format("%,.2f", pe1.hitungPajak()));
        System.out.println("Pajak Petani pt1    = Rp. " + String.format("%,.2f", pt1.hitungPajak()));
        System.out.println("Pajak PNS p2        = Rp. " + String.format("%,.2f", p2.hitungPajak()));
        System.out.println("Masa Kerja p1       = " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pe1      = " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pt1      = " + pt1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja p2       = " + p2.hitungMasaKerja() + " tahun");
        System.out.println();

        System.out.println("=============== Biodata ===============");
        p1.cetakInfo();
        System.out.println();
        pe1.cetakInfo();
        System.out.println();
        pt1.cetakInfo();
        System.out.println();
        p2.cetakInfo();
    }
}
