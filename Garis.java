/* File : Garis.java */
/* Deskripsi : realisasi body Garik */
/* NIM & Nama : 14060123140176/Fauzan Hadi */
/* Tanggal : 20 Febuari 2025 */

public class Garis {
    //Atribut 
    Titik Tawal;
    Titik Takhir;
    static int counterGaris = 0;

    //Method
    public Garis(){
        Tawal = new Titik(0, 0);
        Takhir = new Titik(1, 1);
        counterGaris++;
    }

    //Konstruktor
    public Garis(Titik Tawal, Titik Takhir){
        this.Tawal = Tawal;
        this.Takhir = Takhir;
        counterGaris++;
    }

    //mengembalikan nilai counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    //mengembalikan nilai Tawal
    Titik getTawal(){
        return Tawal;
    }

    //mengembalikan nilai Takhir
    Titik getTakhir(){
        return Takhir;
    }

    //mengubah nilai Tawal
    void setTawal(Titik Tawal){
        this.Tawal = Tawal;
    }

    //mengubah nilai Takhir
    void setTakhir(Titik Takhir){
        this.Takhir = Takhir;
    }

    //Menghitung panjang dari garis
    double getPanjang(){
        double xx = Takhir.getAbsis() - Tawal.getAbsis();
        double yy = Takhir.getOrdinat() - Tawal.getOrdinat();
        return Math.sqrt(xx*xx + yy*yy); //rumus panjang garis
    }

    //Menghitung gradien dari garis
    double getGradien(){
        double xm = Takhir.getAbsis() - Tawal.getAbsis();
        double ym = Takhir.getOrdinat() - Tawal.getOrdinat();
        return ym/xm; //rumus gradien 
    }

    //Mengubah nilai titik tengah
    Titik getTengah(){
        double xb = (Tawal.getAbsis() + Takhir.getAbsis())/2; //nilai tengah sumbu x
        double yb = (Tawal.getOrdinat() + Tawal.getOrdinat())/2; //nilai tengah sumbu y
        return new Titik(xb, yb);
    }

    //Mengecek apakah garis sejajar dengan garis lainnya
    boolean IsSejajar(Garis G){
        return this.getGradien() == G.getGradien(); //sejajar saat m1 = m2
    }

    //Mengecek apakah garis tegak lurus dengan garis lainnya
    boolean IsTegakLurus(Garis G){
        return this.getGradien()*G.getGradien() == -1; //tegak lurus saat m1*m2 = -1
    }

    //Menampilkan ke layar titik awal dan titik akhir garis
    void printGaris() {
        System.out.println("Garis dari (" + Tawal.getAbsis() + ", " + Tawal.getOrdinat() + ") ke (" + Takhir.getAbsis() + ", " + Takhir.getOrdinat() + ")");
    }

    //Menampilkan persamaan garis dalam bentuk string y = mx + c
    String getPersamaan(){
        double m = getGradien(); //gradien
        double c = Takhir.getOrdinat() - (m*Takhir.getAbsis()); //konstanta

        String persamaan = "y = " + m + " x";

        if (c>0){ //Jika nilai konstanta positif
            persamaan += " + " + c;
        }
        if (c<0){ //Jika nilai konstanta negatif
            persamaan += " - " + Math.abs(c);
        }
        //Jika nilai konstanta 0 maka tidak perlu dimasukkan ke persamaan
        return persamaan;
    }
}
