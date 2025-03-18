// Nama File    : Pegawai.java
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 12 Maret 2024
// Deskripsi    : Berisi atribut dan method dalam class Pegawai

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    protected String NIP, nama;
    protected LocalDate tanggalLahir, TMT;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, Double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    // Getter Setter
    public String getNip() { 
        return NIP; 
    }
    public void setNip(String NIP) { 
        this.NIP = NIP; 
    }

    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public LocalDate getTanggalLahir() { 
        return tanggalLahir; 
    }
    public void setTanggalLahir(LocalDate tanggalLahir) { 
        this.tanggalLahir = tanggalLahir; 
    }

    public LocalDate getTmt() { 
        return TMT; 
    }
    public void setTmt(LocalDate TMT) { 
        this.TMT = TMT; 
    }

    public double getGajiPokok() { 
        return gajiPokok; 
    }

    public void setGajiPokok(int gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }
    
    protected String formatTanggal(LocalDate date){
        return date.format(DateTimeFormatter.ofPattern("d MMM yyy"));
    }

    protected int hitungMasaKerja(){
        return Period.between(TMT, LocalDate.now()).getYears();
    }

    public void printInfo(){
        System.out.println(" NIP            : " + NIP);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(TMT));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
    }
}
