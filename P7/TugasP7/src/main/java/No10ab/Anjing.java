/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No10ab;

/**
 *
 * @author Fauzan Hadi
 */
public class Anjing extends Anabul {
    public Anjing(String nama){
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan Melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara Guk-guk.");
    }
}