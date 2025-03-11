// Nama : Fauzan Hadi
// NIM  : 24060123140176

// File         : AngkaSialException.java
// Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
