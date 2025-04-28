// Nama File    : Pegawai.java
// Deskripsi    : Berisi atribut dan method dalam class Pegawai
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 22 April 2025

public class Pegawai{
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}