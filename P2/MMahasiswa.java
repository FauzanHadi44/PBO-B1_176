/* File : MMahasiswa.java */
/* Deskripsi : realisasi main mahasiswa */
/* NIM & Nama : 14060123140176/Fauzan Hadi */
/* Tanggal : 01 Maret 2025 */

public class MMahasiswa {
    public static void main(String[] args){
        //Membuat Objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("40176", "Fauzan Hadi", "Informatika");

        //Membuat Objek Dosen
        Dosen D1 = new Dosen("D1188", "Dr. Sutikno", "Informatika");
        M1.setDosenWali(D1);

        //Membuat Objek Kendaraan
        Kendaraan K1 = new Kendaraan("A 1188 SRI", "Mobil");
        M1.setKendaraan(K1);

        //Membuat Objek Matakuliah
        MataKuliah MK1 = new MataKuliah("MK001", "Dasar Pemrograman", 3);
        MataKuliah MK2 = new MataKuliah("MK002", "Basis Data", 4);
        MataKuliah MK3 = new MataKuliah("MK003", "Struktur Data", 4);
        
        M1.addMatkul(MK1);
        M1.addMatkul(MK2);
        M1.addMatkul(MK3);
        
        //Menampilkan Detail Mahasiswa
        System.out.println("========== Data Mahasiswa ==============");
        M1.printDetailMhs();
        
        // Menampilkan jumlah mata kuliah dan total SKS
        System.out.println("Total Mata Kuliah yang diambil: " + M1.getJumlahMatkul());
        System.out.println("Total SKS yang diambil: " + M1.getJumlahSKS());
        System.out.println("========================================");
    }
}
