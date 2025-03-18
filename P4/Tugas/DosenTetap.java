// Nama File    : DosenTetap.java
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 12 Maret 2024
// Deskripsi    : Berisi atribut dan method dalam class Dosen Tetap

import java.time.LocalDate;

public class DosenTetap extends Dosen{
    private String NIDN;
    private static final int BUP = 65;

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    // Getter Setter
    public String getNidn() { 
        return NIDN; 
    }

    public void setNidn(String NIDN) { 
        this.NIDN = NIDN; 
    }
    

    public int hitungBUP(){
        LocalDate DateBUP = tanggalLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
        return DateBUP.getYear();
    }

    public double hitungTunjangan(){
        int masaKerja = hitungMasaKerja();
        return 0.02 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN            : " + NIDN);
        System.out.println("Jabatan         : Dosen Tetap");
        int masaKerja = hitungMasaKerja();
        System.out.println("Masa Kerja      : " + masaKerja + " tahun");
        System.out.println("BUP             : " + hitungBUP());
        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan       : Rp" + String.format("%,.2f", tunjangan));
    }
}
