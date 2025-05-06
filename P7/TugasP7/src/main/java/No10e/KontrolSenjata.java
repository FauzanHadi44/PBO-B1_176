/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No10e;

/**
 *
 * @author Fauzan Hadi
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        int stokPeluru = senjata.getPeluru();
        if (stokPeluru == 0) {
            System.out.println("Peluru Habis");
            return; // Keluar lebih awal, tidak lanjut menembak
        }

        for (int i = 0; i < jumlah; i++) {
            if (stokPeluru > 0) {
                System.out.println(senjata.getBunyi());
                stokPeluru--;
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        senjata.setPeluru(stokPeluru);
        System.out.println(">> Peluru sisa: " + stokPeluru);
    }
    
    public String menusuk(){
        if (senjata.isMenusuk()){
            return "menusuk";
        } else{
            return "senjata tidak bisa menusuk";
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
    }
}
