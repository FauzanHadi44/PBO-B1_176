/* File : MTitik.java */
/* Deskripsi : realisasi Main Titik */
/* NIM & Nama : 14060123140176/Fauzan Hadi */
/* Tanggal : 20 Febuari 2025 */

public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        // Membuat titik T1
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        T1.setAbsis(1);
        T1.setOrdinat(2);
        T1.printTitik();

        //Membuat titik T2
        System.out.println("\n Titik T2: ");
        Titik T2 = new Titik();
        T2.setAbsis(-3);;
        T2.setOrdinat(5);
        T2.printTitik();

        //Membuat titik T3
        System.out.println("\n Titik T3:");
        Titik T3 = new Titik(-4, -2);
        T3.printTitik();

        //Membuat titik T4
        System.out.println("\n Titik T4:");
        Titik T4 = new Titik(6, -3); 
        T4.printTitik();

        //Membuat Titik Geser
        System.out.println("\n Titik geser:");
        System.out.println("Titik T1:");
        T1.geser(3, 4);
        T1.printTitik();
        System.out.println("Titik T2:");
        T2.geser(-1, 2); 
        T2.printTitik();
        System.out.println("Titik T3:");
        T3.geser(3, 1);
        T3.printTitik();
        System.out.println("Titik T4:");
        T4.geser(-1, 2);
        T4.printTitik();

        //Membuat getCounterTitik
        System.out.println("\n Titik Counter Titik: ");
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        //Mmebuat Kuadran
        System.out.println("\n Titik Kuadran: ");
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Kuadran T2: " + T2.getKuadran());
        System.out.println("Kuadran T3: " + T3.getKuadran());
        System.out.println("Kuadran T4: " + T4.getKuadran());

        //Membuat Jarak Pusat Ke Titik
        System.out.println("\n Titik Jarak Ke Pusat: ");
        System.out.println("Jarak Pusat T1: " + T1.getJarakPusat());
        System.out.println("Jarak Pusat T2: " + T2.getJarakPusat());
        System.out.println("Jarak Pusat T3: " + T3.getJarakPusat());
        System.out.println("Jarak Pusat T4: " + T4.getJarakPusat());

        // Menampilkan jarak antara dua titik
        System.out.println("\n Titik Jarak:");
        System.out.println("Jarak antara T1 dan T2: " + T1.getJarak(T2));
        System.out.println("Jarak antara T2 dan T3: " + T2.getJarak(T3));
        System.out.println("Jarak antara T3 dan T4: " + T3.getJarak(T4));
        System.out.println("Jarak antara T4 dan T1: " + T4.getJarak(T1));

        // Menampilkan Refleksi X
        System.out.println("\n Refleksi X: ");
        T1.refleksiX();
        System.out.println("Titik T1 setelah refleksi sumbu X: ");
        T1.printTitik();

        T2.refleksiX();
        System.out.println("Titik T2 refleksi sumbu X: ");
        T2.printTitik();

        T3.refleksiX();
        System.out.println("Titik T3 refleksi sumbu X: ");
        T3.printTitik();

        T4.refleksiX();
        System.out.println("Titik T4 refleksi sumbu X: ");
        T4.printTitik();

        //Menampilkan Titik getRefleksi X
        System.out.println("\n Titik getrefleksi sumbu X: ");

        Titik refleksiX1 = T1.getRefleksiX();
        System.out.println("Titik T1 setelah getRefleksi sumbu X: ");
        refleksiX1.printTitik();

        Titik refleksiX2 = T2.getRefleksiX();
        System.out.println("Titik T2 setelah getRefleksi sumbu X: ");
        refleksiX2.printTitik();
        
        Titik refleksiX3 = T3.getRefleksiX();
        System.out.println("Titik T3 setelah getRefleksi sumbu X: ");
        refleksiX3.printTitik();

        Titik refleksiX4 = T4.getRefleksiX();
        System.out.println("Titik T4 setelah getRefleksi sumbu X: ");
        refleksiX4.printTitik();

        
        // Menampilkan Refleksi Y
        System.out.println("\n Refleksi Y: ");
        T1.refleksiY();
        System.out.println("Titik T1 refleksi sumbu Y: ");
        T1.printTitik();

        T2.refleksiY();
        System.out.println("Titik T2 refleksi sumbu Y: ");
        T2.printTitik();

        T3.refleksiY();
        System.out.println("Titik T3 refleksi sumbu Y: ");
        T3.printTitik();

        T4.refleksiY();
        System.out.println("Titik T4 refleksi sumbu Y: ");
        T4.printTitik();
        
        //Menampilkan Titik getRefleksi Y
        System.out.println("\n Titik getrefleksi sumbu Y: ");

        Titik refleksiY1 = T1.getRefleksiY();
        System.out.println("Titik T1 setelah getRefleksi sumbu Y: ");
        refleksiY1.printTitik();

        Titik refleksiY2 = T2.getRefleksiY();
        System.out.println("Titik T2 setelah getRefleksi sumbu Y: ");
        refleksiY2.printTitik();
        
        Titik refleksiY3 = T3.getRefleksiY();
        System.out.println("Titik T3 setelah getRefleksi sumbu Y: ");
        refleksiY3.printTitik();

        Titik refleksiY4 = T4.getRefleksiY();
        System.out.println("Titik T4 setelah getRefleksi sumbu Y: ");
        refleksiY4.printTitik();

    }
}