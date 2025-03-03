/* File : Mahasiswa.java */
/* Deskripsi : realisasi body mahasiswa */
/* NIM & Nama : 14060123140176/Fauzan Hadi */
/* Tanggal : 01 Maret 2025 */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan Kendaraan;

    public Mahasiswa(){
        listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return Kendaraan;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan Kendaraan) {
        this.Kendaraan = Kendaraan;
    }

    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    public void printDetailMhs() {
        System.out.println("Mahasiswa : " + nim + " - " + nama + " - " + prodi);
    
        // Menampilkan informasi dosen wali 
        if (dosenWali != null) {
            System.out.println("Dosen Wali : " + dosenWali.getNama() + " - " + dosenWali.getNip() + " - " + dosenWali.getProdi());
        } 
    
        // Menampilkan informasi kendaraan jika ada
        System.out.println("Kendaraan : " + (Kendaraan != null ? Kendaraan.getJenis() + " - " + Kendaraan.getNoPlat() : "Tidak punya"));
    
        // Menampilkan daftar mata kuliah yang diambil
        System.out.println("Mata Kuliah yang diambil :");
        if (listMatkul.isEmpty()) {
        } else {
            for (MataKuliah newMataKuliah : listMatkul) {
                System.out.println(" - " + newMataKuliah.getNama() + " (" + newMataKuliah.getSks() + " SKS)");
            }
        }
    }

}
