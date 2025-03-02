/* File : MataKuliah.java */
/* Deskripsi : realisasi body MataKuliah */
/* NIM & Nama : 14060123140176/Fauzan Hadi */
/* Tanggal : 27 Febuari 2025 */

public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    public MataKuliah(){
        idMatkul = "-";
        nama = "-";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public void setIdMatkul(String x){
        this.idMatkul = x;
    }

    public void setNama(String y){
        this.nama = y;
    }

    public void setSks(int z){
        this.sks = z;
    }
}
