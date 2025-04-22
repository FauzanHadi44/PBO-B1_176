// Nama File    : Programmer.java
// Deskripsi    : Berisi atribut dan method dalam class Programmer
// Pembuat      : Fauzan Hadi / 24060123140176
// Tanggal      : 22 April 2025

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }   
}
