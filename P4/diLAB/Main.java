// Nama File    : BangunDatar.java
// Pembuat      : Fauzan Hadi/24060123140176

public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi2 = new Persegi();
        System.out.println("Informasi Persegi:");
        persegi2.printInfo();
        System.out.println();

        Persegi persegi = new Persegi(5.0, "Merah", "Solid");
        System.out.println("Informasi Persegi:");
        persegi.printInfo(); 
        System.out.println();

        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterBangunDatar();
    }
}