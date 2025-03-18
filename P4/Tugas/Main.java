// Nama File    : Main.java
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 12 Maret 2024
// Deskripsi    : Berisi main dalam class Pegawai, Dosen, DosenTetap, DosenTamu, Tendik

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        System.out.println("========== Pegawai Perguruan Tinggi ========== \n");
        DosenTetap dosenTetap = new DosenTetap(
            "11880011",
            "88110001",
            "Dr. Hadi Sutomo",
            LocalDate.of(1990, 1, 6), 
            LocalDate.of(2017, 2, 15),
            9750000,
            "Fakultas Kedokteran"
        );

        DosenTamu dosenTamu = new DosenTamu(
            "11880022", 
            "88110001", 
            "Dr. H. Alip Sujoyo", 
            LocalDate.of(1998, 3, 12), 
            LocalDate.of(2019, 5, 13), 
            5850000, 
            "Fakultas Teknik", 
            LocalDate.of(2025, 5, 31)
        );

        Tendik tendik = new Tendik(
            "11880033", 
            "Ahmad Junaedi", 
            LocalDate.of(2001, 6, 5), 
            LocalDate.of(2018, 4, 14), 
            4500000, 
            "Akademik"
            );
        
        System.out.println("===== Informasi Dosen Tetap =====");
        dosenTetap.printInfo();

        System.out.println("\n ===== Informasi Dosen Tamu =====");
        dosenTamu.printInfo();

        System.out.println("\n ===== Informasi Pegawai Tendik =====");
        tendik.printInfo();
    
    }
}
