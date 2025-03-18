// Nama File    : Dosen.java
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 12 Maret 2024
// Deskripsi    : Berisi atribut dan method dalam class Dosen 

import java.time.LocalDate;

public class Dosen extends Pegawai{
    protected String Fakultas;

    public Dosen(String NIP, String nama, LocalDate tangglLahir, LocalDate TMT, double gajiPokok, String Fakultas){
        super(NIP, nama, tangglLahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
    }

    // Getter Setter
    public String getFakultas() { 
        return Fakultas; 
    }
    public void setFakultas(String Fakultas) { 
        this.Fakultas = Fakultas; 
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas        : " + Fakultas);
    }
}
