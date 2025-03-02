/* File : MMahasiswa.java */
/* Deskripsi : realisasi main mahasiswa */
/* NIM & Nama : 14060123140176/Fauzan Hadi */
/* Tanggal : 01 Maret 2025 */

public class MMahasiswa {
    public static void main(String[] args){
        //Membuat Objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("40176", "Fauzan Hadi", "Informatika");
        Mahasiswa M2 = new Mahasiswa("40147", "Alex Yuda", "Informatika");

        //Membuat Objek Dosen
        Dosen D1 = new Dosen("D1188", "Dr. Sutikno", "Informatika");
        Dosen D2 = new Dosen("D1818", "Dr. Sukirman", "Informatika");
        M1.setDosenWali(D1);
        M2.setDosenWali(D2);

        //Membuat Objek Kendaraan
        Kendaraan K1 = new Kendaraan("A 1188 SRI", "Mobil");
        Kendaraan K2 = new Kendaraan("E 1174 SRT", "Mobil");
        M1.setKendaraan(K1);
        M2.setKendaraan(K2);

        //Membuat Objek Matakuliah
        MataKuliah MK1 = new MataKuliah("MK001", "Dasar Pemrograman", 3);
        MataKuliah MK2 = new MataKuliah("MK002", "Basis Data", 4);
        MataKuliah MK3 = new MataKuliah("MK003", "Struktur Data", 4);
        MataKuliah MK4 = new MataKuliah("MK004", "Olah Raga", 2);
        MataKuliah MK5 = new MataKuliah("MK005", "Sistem Cerdas", 3);
        
        M1.addMatkul(MK2);
        M1.addMatkul(MK3);
        M1.addMatkul(MK5);
        
        M2.addMatkul(MK1);
        M2.addMatkul(MK4);

        //Menampilkan Detail Mahasiswa1
        System.out.println("========== Data Mahasiswa 1 ==============");
        System.out.println("Detail Mahasiswa:");
        M1.printDetailMhs();

        // Menampilkan jumlah mata kuliah dan total SKS
        System.out.println("Total Mata Kuliah yang diambil: " + M1.getJumlahMatkul());
        System.out.println("Total SKS yang diambil: " + M1.getJumlahSKS());
        System.out.println("========================================\n");

        //Menampilkan Detail Mahasiswa2
        System.out.println("========== Data Mahasiswa 2 ==============");
        System.out.println("Detail Mahasiswa:");
        M2.printDetailMhs();
        
        // Menampilkan jumlah mata kuliah dan total SKS
        System.out.println("Total Mata Kuliah yang diambil: " + M2.getJumlahMatkul());
        System.out.println("Total SKS yang diambil: " + M2.getJumlahSKS());
        System.out.println("========================================");
    }
}
