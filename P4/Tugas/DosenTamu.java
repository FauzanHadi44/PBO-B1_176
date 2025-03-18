// Nama File    : DosenTamu.java
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 12 Maret 2024
// Deskripsi    : Berisi atribut dan method dalam class Dosen Tamu

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen{
    private String NIDK;
    private LocalDate kontrakBerakhir;
    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas, LocalDate kontrakBerakhir){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.kontrakBerakhir = kontrakBerakhir;
    }

    // Getter Setter
    public String getNidk() { 
        return NIDK; 
    }
    public void setNidk(String NIDK) { 
        this.NIDK = NIDK; 
    }

    public double hitungTunjangan(){
        return 0.025 * gajiPokok;
    }

    public int sisaKontrak() {
        return Period.between(LocalDate.now(), kontrakBerakhir).getMonths();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK            : " + NIDK);
        System.out.println("Jabatan         : Dosen Tamu" );
        int sisaKontrak = sisaKontrak();
        System.out.println("Sisa Kontrak    : " + sisaKontrak + " bulan");
        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", tunjangan));
    }
}
