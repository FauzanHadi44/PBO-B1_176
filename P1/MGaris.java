/* File : MGaris.java */
/* Deskripsi : realisasi main garis */
/* NIM & Nama : 14060123140176/Fauzan Hadi */
/* Tanggal : 20 Febuari 2025 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek Titik
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        T1.setAbsis(2);
        T1.setOrdinat(-3);
        T1.printTitik();

        System.out.println("Titik T2:");
        Titik T2 = new Titik();
        T2.setAbsis(5);
        T2.setOrdinat(1);
        T2.printTitik();

        System.out.println("Titik T3:");
        Titik T3 = new Titik();
        T3.setAbsis(4);
        T3.setOrdinat(-2);
        T3.printTitik();

        System.out.println("Titik T4:");
        Titik T4 = new Titik();
        T4.setAbsis(6); 
        T4.setOrdinat(-1);
        T4.printTitik();

        // Membuat objek Garis dengan titik 
        Garis G1 = new Garis(T1, T2);
        Garis G2 = new Garis(T3, T4);

        // Menampilkan jumlah garis 
        System.out.println("Jumlah garis yang telah dibuat: " + Garis.getCounterGaris());

        // Menampilkan informasi garis G1
        System.out.println("\nGaris G1:");
        G1.printGaris();
        System.out.println("Panjang Garis G1: " + G1.getPanjang());
        System.out.println("Gradien Garis G1: " + G1.getGradien());
        System.out.println("Titik Tengah Garis G1: (" + G1.getTengah().getAbsis() + "," + G1.getTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis G1: " + G1.getPersamaan());
        
        // Menampilkan informasi garis G2
        System.out.println("\nGaris G2:");
        G2.printGaris();
        System.out.println("Panjang Garis G2: " + G2.getPanjang());
        System.out.println("Gradien Garis G2: " + G2.getGradien());
        System.out.println("Titik Tengah Garis G2: (" + G2.getTengah().getAbsis() + "," + G2.getTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis G2: " + G2.getPersamaan());

        // Menampilkan hubungan antara garis
        System.out.println("\nApakah Garis G1 sejajar dengan Garis G2? " + G1.IsSejajar(G2));
        System.out.println("Apakah Garis G1 tegak lurus dengan Garis G2? " + G1.IsTegakLurus(G2));
    }
}
