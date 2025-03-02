/* File : MDosen.java */
/* Deskripsi : realisasi body Dosen */
/* NIM & Nama : 14060123140176/Fauzan Hadi */
/* Tanggal : 27 Febuari 2025 */

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen(){
        nip = "-";
        nama = "-";
        prodi = "-";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNip(String x){
        this.nip = x;
    }

    public void setNama(String y){
        this.nama = y;
    }

    public void setProdi(String z){
        this.prodi = z;
    }
}
