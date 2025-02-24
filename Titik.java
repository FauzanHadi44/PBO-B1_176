/* File : Titik.java */
/* Deskripsi : realisasi body Titik */
/* NIM & Nama : 14060123140176/Fauzan Hadi */
/* Tanggal : 20 Febuari 2025 */

public class Titik {
    /* States/Atribut */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* Behavior/Method */
    // Konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }
    
    //Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis
    void setAbsis(double x) {
        absis = x;
    }

    // Mengubah nilai ordinat
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0;
    }

    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //mengembalikan nilai jarak antara titik akar
    double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    } 

    void refleksiX() {
        ordinat = ordinat * -1;
    }

    void refleksiY() {
        absis = absis * -1;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, this.ordinat * -1);
    }

    public Titik getRefleksiY() {
        return new Titik(this.absis * -1, this.ordinat);
    }
}