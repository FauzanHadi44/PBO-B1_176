/* File : Kendaraan.java */
/* Deskripsi : realisasi Kendaraan */
/* NIM & Nama : 14060123140176/Fauzan Hadi */
/* Tanggal : 27 Febuari 2025 */

public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan(){
        noPlat = "-";
        jenis = "-";
    }
    
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String x){
        this.noPlat = x;
    }

    public void setJenis(String y){
        this.jenis = y;
    }
}
