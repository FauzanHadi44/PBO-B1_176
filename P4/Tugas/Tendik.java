// Nama File    : Tendik.java
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 12 Maret 2024
// Deskripsi    : Berisi atribut dan method dalam class Tendik

import java.time.LocalDate;

public class Tendik extends Pegawai{
    private String bidang;
    private static final int BUP = 55;
    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        if (!bidang.equalsIgnoreCase("Akademik") && !bidang.equalsIgnoreCase("Kemahasiswaan") && !bidang.equalsIgnoreCase("Sumber Daya")) {
            this.bidang = "Tidak Diketahui";
        } else {
            this.bidang = bidang;
        }
    }

    // Getter Setter
    public String getBidang() {
        return bidang;
    }
    
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public int hitungBUP(){
        LocalDate DateBUP = tanggalLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
        return DateBUP.getYear();
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja();
        return 0.01 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);
        int masaKerja = hitungMasaKerja();
        System.out.println("Masa Kerja      : " + masaKerja + " tahun");
        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", tunjangan));
    }
}
