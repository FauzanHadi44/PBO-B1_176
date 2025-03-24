// Nama File    : Manusia.java
// Deskripsi    : Berisi atribut dan method dalam class Super Manusia
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 22 Maret 2025

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;   

public abstract class Manusia {
    protected String nama;
    protected Date tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.alamat = alamat;
        
        try {
            this.tgl_mulai_kerja = new SimpleDateFormat("dd-MM-yyyy").parse(tgl_mulai_kerja);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + tgl_mulai_kerja);
            this.tgl_mulai_kerja = new Date();
        }
        
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public Date getTglMulaiKerja(){
        return tgl_mulai_kerja;
    }
    
    public void setTglMulaiKerja(Date tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
        
    public static int getCounterMns(){
        return counterMns;
    }
    
    public int hitungMasaKerja(int x) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(tgl_mulai_kerja); 
        int tahunMulai = cal.get(Calendar.YEAR);
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        return (tahunSekarang - tahunMulai) + x;
    }

    public void cetakInfo(){


        System.out.println("Nama                : " + nama);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Tanggal Mulai Kerja : " + new SimpleDateFormat("dd-MM-yyyy").format(tgl_mulai_kerja));
        System.out.println("Pendapatan          : Rp. " + String.format("%,.2f", pendapatan));
    }

}
